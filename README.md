# mybatis-generator

## 模块二（mbg-ext）
### mybatis generator自定义逆向工程防覆盖sql代码
##### 通过自定义插件生成/dao/xxxMapperExt.java和/mapper/xxxMapper.java区分开，以及生成xxxMapperExt.xml和xxxMapper.xml，自定义的sql和方法放在xxxMapperExt.xml和xxxMapperExt.java（ext文件只生成一次）中，xxxMapper.java和xxxMapper.xml的方法和sql随时可以因为表字段的修改而再次在生成，不影响xxxMapperExt.xml中的自定义sql

主要思路：
+ 1、写个```MyIntrospectedTableImpl```类，继承```IntrospectedTableMyBatis3Impl```，重写```getMyBatis3SqlMapNamespace```方法改变生成后的```xxxMapper.xml```的命名空间为```namespace="com.xxx.xxx.xxx.BiResumeMapperExt"```；
+ 2、自定义插件```DaoExtPlugin```继承```PluginAdapter```，重写```validate```方法进行数据校验；
    + 2.1、在自定义插件```DaoExtPlugin```重写```contextGenerateAdditionalJavaFiles```方法，新增dao层生成```xxxMapperExt.java```扩展文件；
    + 2.2、在自定义插件```DaoExtPlugin```重写```contextGenerateAdditionalXmlFiles```方法，新增```xxxMapperExt.xml```扩展文件，```GeneratedXmlFile```构造xml文件对象的isMergeable参数是表示执行generator逆向工程前后的文件是否合并，如果为false则我们写的扩展sql不会被覆盖；
    + 2.3、在自定义插件```DaoExtPlugin```重写```sqlMapDocumentGenerated```在xxxMapper.xml中生成findBy的sql和重写```clientGenerated```在在xxxMapper.java中生成自定义查询的方法List<xxxEntity> findBy(xxxEntity entity)；
+ 3、为了将```xxxMapper.java```和```xxxMapperExt.java```分开存储到不同的文件夹中，
并且让```xxxMapperExt.xml```继承Mybatis中的```xxxMapper.xml```文件很重要的一点就是要让两个Mapper.xml文件的命名空间相同，这样才能够实现继承（在generatorConfig.xml中引用CommentGenerator的地方配置```<property name="replaceNamespace" value="true"/>```）。
所以为了在生成原始 ```xxxMapper.xml```的时候去修改他的命名空间，需要在```public class CommentGenerator extends DefaultCommentGenerator```中重写```addRootComment```方法，修改原始生成的```xxxMapper.xml```中的```namespace="com.mdl.mbg.dao.BiResumeMapperExt"```形式（主要是将```com.mdl.mbg.mapper.BiResumeMapperExt``` 改为 ```com.mdl.mbg.dao.BiResumeMapperExt```，替换中间的mapper为dao）；
+ 4、在generatorConfig.xml中将```targetRuntime="MyBatis3"```或者```targetRuntime="Mybatis3Simple"```替换为```targetRuntime="com.mdl.mbg.generator.MyIntrospectedTableImpl"```
    然后使用自定义插件```<plugin type="com.mdl.mbg.generator.DaoExtPlugin"></plugin>```，
    注意：这个```commentGenerator```放置的顺序，它一定时要在 property 和 plugin 后面的


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

1、写个```MyIntrospectedTableImpl```类，继承```IntrospectedTableMyBatis3Impl```，重写```getMyBatis3SqlMapNamespace```方法改变生成后的```xxxMapper.xml```的命名空间为```namespace="com.xxx.xxx.xxx.BiResumeMapperExt"```

```$xslt
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;

public class MyIntrospectedTableImpl extends IntrospectedTableMyBatis3Impl {

    /**
     * 修改原始xxxMapper.xml的命名空间namespace
     * @return
     */
    @Override
    public String getMyBatis3SqlMapNamespace() {
        //获取mapper.java包名
        String targetPackage = context.getJavaClientGeneratorConfiguration().getTargetPackage();
        StringBuffer stringBuffer = new StringBuffer();
        String namespace = getMyBatis3JavaMapperType();
        if (namespace == null) {
            namespace = getMyBatis3FallbackSqlMapNamespace();
        }
        //获取最后一个名字
        String daoName = namespace.substring(namespace.lastIndexOf("."));
        //修改命名空间为对应扩展文件
        stringBuffer.append(targetPackage).append(daoName).append("Ext");
        return stringBuffer.toString();
    }
}

```


2、自定义插件```DaoExtPlugin```继承```PluginAdapter```，重写```validate```方法，重写```contextGenerateAdditionalJavaFiles```，重写```contextGenerateAdditionalXmlFiles```方法，重写```sqlMapDocumentGenerated```，重写```clientGenerated```
```$xslt

package com.mdl.mbg.generator;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.*;
import org.mybatis.generator.codegen.XmlConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : mall
 * @Package Name : com.mdl.mbg.generator
 * @Description :   2.自定义插件DaoExtPlugin继承PluginAdapter，重写validate方法进行数据校验
 *                  3.重写contextGenerateAdditionalJavaFiles方法，新增dao层java扩展文件
 *                  4、重写contextGenerateAdditionalXmlFiles方法，新增mapper.xml扩展文件
 *                  4.1、GeneratedXmlFile构造xml文件对象的isMergeable参数是表示执行generator逆向工程前后的文件是否合并，如果为false则我们写的扩展sql不会被覆盖
 * @Author : xiekun
 * @Create Date : 2020年05月08日 14:52
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
public class DaoExtPlugin extends PluginAdapter {

    private static final Logger logger = LoggerFactory.getLogger(DaoExtPlugin.class);

    private String daoTargetProject = null;
    private String daoTargetPackage = null;
    private String mapperTargetProject = null;
    private String mapperTargetPackage = null;


    /**
     * 2.自定义插件DaoExtPlugin继承PluginAdapter，重写validate方法进行数据校验
     *
     * @param warnings
     * @return
     */
    @Override
    public boolean validate(List<String> warnings) {
        daoTargetProject = context.getJavaClientGeneratorConfiguration().getTargetProject();
        daoTargetPackage = context.getJavaClientGeneratorConfiguration().getTargetPackage();
        mapperTargetProject = context.getSqlMapGeneratorConfiguration().getTargetProject();
        mapperTargetPackage = context.getSqlMapGeneratorConfiguration().getTargetPackage();
        return true;
    }

    private static Boolean fileIsNotExists(String filePath, String fileName) {
        String fileStr = filePath.replace(".",File.separator) + File.separator + fileName;
        File file = new File(fileStr);
        return !file.exists();
    }


    /**
     * 3.重写contextGenerateAdditionalJavaFiles方法，新增dao层xxxMapperExt.java扩展文件
     *
     * @param introspectedTable
     * @return
     */
    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {

        List<GeneratedJavaFile> answer = new ArrayList<>();

        context.getTableConfigurations().stream().forEach(t -> {
            String daoName = t.getDomainObjectName().replace("Entity","");
            String filePath = daoTargetPackage;
            //extMapper存放到dao文件夹中，与mapper文件夹区分开来
            String extMapperPath = filePath.replace("mapper","dao");
            String file = daoTargetProject + "." + extMapperPath;
            String fileName = daoName + "MapperExt.java";
            String supperFilePath = daoTargetPackage + "." + daoName + "Mapper";

            //如果存放自定义sql方法的xxxMapperExt.java文件已经生成，则不再覆盖
            if (fileIsNotExists(file, fileName)) {

                logger.info("\n------------------------------------------------------------------------------------------------\n");
                logger.error("红色警告--红色警告--红色警告--《" + file + fileName + "》--自定义文件是否真的不存在，有被覆盖的风险");
                logger.info("\n------------------------------------------------------------------------------------------------\n");

                //定义一个接口
                Interface face = new Interface(extMapperPath + "." + daoName + "MapperExt");

                //此接口继承父类
                face.addSuperInterface(new FullyQualifiedJavaType(supperFilePath));

                //设置接口的修饰符
                face.setVisibility(JavaVisibility.PUBLIC);
                face.addAnnotation("@Resource");

                //导包
                face.addImportedType(new FullyQualifiedJavaType(properties.getProperty("import", "javax.annotation.Resource")));
                face.addImportedType(new FullyQualifiedJavaType(supperFilePath));

                //构造自定义java文件对象
                GeneratedJavaFile jf = new GeneratedJavaFile(face, daoTargetProject, context.getJavaFormatter());
                answer.add(jf);
            }
        });

        return answer;
    }


    /**
     * 4、重写contextGenerateAdditionalXmlFiles方法，新增xxxMapper.xml扩展文件
     * GeneratedXmlFile构造xml文件对象的isMergeable参数是表示执行generator逆向工程前后的文件是否合并，如果为false则我们写的扩展sql不会被覆盖
     *
     * @return
     */
    @Override
    public List<GeneratedXmlFile> contextGenerateAdditionalXmlFiles() {

        List<GeneratedXmlFile> list = new ArrayList<>();

        context.getTableConfigurations().stream().forEach(t -> {
            String daoName = t.getDomainObjectName().replace("Entity","");
            //extMapper存放到dao文件夹中，与mapper文件夹区分开来
            String extMapperPath = daoTargetPackage.replace("mapper","dao");
            String nameSpace = extMapperPath + "." + daoName + "MapperExt";
            String fileName = daoName + "MapperExt.xml";
            String filePath = mapperTargetProject + "." + mapperTargetPackage;

            //如果存放自定义sql的xxxMapperExt.xml文件已经生成，则不再覆盖
            if (fileIsNotExists(filePath, fileName)) {
                logger.info("\n------------------------------------------------------------------------------------------------\n");
                logger.error("红色警告--红色警告--红色警告--红色警告--《" + filePath + fileName + "》--自定义文件是否真的不存在，有被覆盖的风险");
                logger.info("\n------------------------------------------------------------------------------------------------\n");

                Document document = new Document(XmlConstants.MYBATIS3_MAPPER_PUBLIC_ID
                        , XmlConstants.MYBATIS3_MAPPER_SYSTEM_ID);
                XmlElement root = new XmlElement("mapper");

                Attribute attribute = new Attribute("namespace",nameSpace);
                root.addAttribute(attribute);
                document.setRootElement(root);
                //创建mapper扩展文件
                GeneratedXmlFile gxf = new GeneratedXmlFile(document, fileName, mapperTargetPackage, mapperTargetProject, false, context.getXmlFormatter());
                list.add(gxf);
            }
        });
        return list;
    }


    /**
     * 创建自定义的根据字段条件查询的sql List<xxxEntity> findBy(xxxEntity entity)
     * @param document
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable){

        String daoPackage = context.getJavaModelGeneratorConfiguration().getTargetPackage();
        String daoName = introspectedTable.getTableConfiguration().getDomainObjectName();

        //获取xml文件的根结点
        XmlElement rootElement = document.getRootElement();

        //新增一个select方法的节点加到根目录下，指定id，参数，返回类型
        XmlElement select = new XmlElement("select");
        select.addAttribute(new Attribute("resultMap","BaseResultMap"));
        select.addAttribute(new Attribute("id","findBy"));
        select.addAttribute(new Attribute("parameterType",daoPackage + "." + daoName));

        //新增一个文本节点，拼接sql
        TextElement selectStr = new TextElement("select <include refid=\"Base_Column_List\" /> from "
                + introspectedTable.getTableConfiguration().getTableName());

        select.addElement(selectStr);
        select.addElement(getWhere(introspectedTable));
        rootElement.addElement(select);

        return super.sqlMapDocumentGenerated(document,introspectedTable);
    }

    private Element getWhere(IntrospectedTable introspectedTable) {
        List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();
        XmlElement where = new XmlElement("where");
        allColumns.stream().forEach(column -> {
            XmlElement ifFlag = new XmlElement("if");
            ifFlag.addAttribute(new Attribute("test",column.getJavaProperty()+" != null"));
            String andText = "and " + column.getActualColumnName() + " = #{" + column.getJavaProperty() + ",jdbcType=" + column.getJdbcTypeName() + "}";
            TextElement and = new TextElement(andText);
            ifFlag.addElement(and);
            where.addElement(ifFlag);
        });
        return where;
    }


    /**
     * 创建mapper.java中的方法 List<xxxEntity> findBy(xxxEntity entity)
     * @param interfaze
     * @param topLevelClass
     * @param introspectedTable
     * @return
     */
    @Override
    public boolean clientGenerated(Interface interfaze,TopLevelClass topLevelClass,IntrospectedTable introspectedTable){
        Method m = new Method("findBy");
        m.setVisibility(m.getVisibility());
        String domainObjectName = introspectedTable.getTableConfiguration().getDomainObjectName();
        m.setReturnType(new FullyQualifiedJavaType("List<"+domainObjectName+">"));
        m.addParameter(new Parameter(new FullyQualifiedJavaType(domainObjectName),
                domainObjectName.substring(0,1).toLowerCase() + domainObjectName.substring(1)));
        interfaze.addMethod(m);
        interfaze.addImportedType(new FullyQualifiedJavaType("java.util.List"));
        return super.clientGenerated(interfaze,topLevelClass,introspectedTable);
    }


}


```

3、```CommentGenerator```继承```DefaultCommentGenerator```配置给model的字段添加注释，以及重写```addRootComment```方法，修改原始生成的xxxMapper.xml中的namespace为"com.mdl.mbg.dao.BiResumeMapperExt"形式
注意要在generatorConfig.xml中引用CommentGenerator的地方配置```<property name="replaceNamespace" value="true"/>```注意一下 这个```commentGenerator```放置的顺序，它一定时要在 property 和 plugin 后面的
```$xslt
package com.mdl.mbg.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.List;
import java.util.Properties;

/**
 * 自定义注释生成器
 */
public class CommentGenerator extends DefaultCommentGenerator {

    private boolean addRemarkComments = false;
    private static final String EXAMPLE_SUFFIX="Example";
    private static final String API_MODEL_PROPERTY_FULL_CLASS_NAME="io.swagger.annotations.ApiModelProperty";

    private Properties myPoperties = new Properties();

    /**
     * 设置用户配置的参数
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        //本地保存一份properties
        this.myPoperties.putAll(properties);
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }

    /**
     * 给字段添加注释
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        //根据参数和备注信息判断是否添加备注信息
        if(addRemarkComments&&StringUtility.stringHasValue(remarks)){
//            addFieldJavaDoc(field, remarks);
            //数据库中特殊字符需要转义
            if(remarks.contains("\"")){
                remarks = remarks.replace("\"","'");
            }
            //给model的字段添加swagger注解
            field.addJavaDocLine("@ApiModelProperty(value = \""+remarks+"\")");
        }
    }

    /**
     * 给model的字段添加注释
     */
    private void addFieldJavaDoc(Field field, String remarks) {
        //文档注释开始
        field.addJavaDocLine("/**");
        //获取数据库字段的备注信息
        String[] remarkLines = remarks.split(System.getProperty("line.separator"));
        for(String remarkLine:remarkLines){
            field.addJavaDocLine(" * "+remarkLine);
        }
        addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        super.addJavaFileComment(compilationUnit);
        //只在model中添加swagger注解类的导入
        if(!compilationUnit.isJavaInterface()&&!compilationUnit.getType().getFullyQualifiedName().contains(EXAMPLE_SUFFIX)){
            compilationUnit.addImportedType(new FullyQualifiedJavaType(API_MODEL_PROPERTY_FULL_CLASS_NAME));
        }
    }


    /**
     * 5、重写addRootComment方法，修改原始生成的xxxMapper.xml中的namespace为"com.mdl.mbg.dao.BiResumeMapperExt"形式
     * @param rootElement
     */
    @Override
    public void addRootComment(XmlElement rootElement) {
        super.addRootComment(rootElement);
        Object replaceNamespace = myPoperties.get("replaceNamespace");
        if(null==replaceNamespace||replaceNamespace.toString().equals("false")){
            return;
        }
        List<Attribute> lists =  rootElement.getAttributes();
        int delIndex = -1;String orginNameSpace="";
        for(int i = 0;i<lists.size();i++){
            if(lists.get(i).getName().equals("namespace")){
                orginNameSpace = lists.get(i).getValue();
                //if(orginNameSpace.endsWith("Ext"))break;
                delIndex = i;
                break;
            }
        }
        if(delIndex!=-1){
            lists.remove(delIndex);
            rootElement.getAttributes().add(new Attribute("namespace", orginNameSpace.replace(".mapper.",".dao.")));
        }
    }


}

```

4、在generatorConfig.xml中将```targetRuntime="MyBatis3"```或者```targetRuntime="Mybatis3Simple"```替换为```targetRuntime="com.mdl.mbg.generator.MyIntrospectedTableImpl"```
然后使用自定义插件```<plugin type="com.mdl.mbg.generator.DaoExtPlugin"></plugin>```
```$xslt
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<generatorConfiguration>
    <properties resource="generator.properties"/>
    <context id="MySqlContext" targetRuntime="com.mdl.mbg.generator.MyIntrospectedTableImpl" defaultModelType="flat">
        <!--<context id="MySqlContext" targetRuntime="MyBatis3" defaultModelType="flat">-->
        <property name="beginningDelimiter" value="`"/>
        <property name="endingDelimiter" value="`"/>
        <property name="javaFileEncoding" value="UTF-8"/>

        <!-- 使用自定义的扩展插件生成xxxMapperExt.java 和 xxxMapperExt.xml -->
        <plugin type="com.mdl.mbg.generator.DaoExtPlugin"></plugin>

        <!-- 为模型生成序列化方法-->
        <plugin type="org.mybatis.generator.plugins.SerializablePlugin"/>

        <!-- 为生成的Java模型创建一个toString方法 -->
        <plugin type="org.mybatis.generator.plugins.ToStringPlugin"/>

        <!-- 生成mapper.xml时覆盖原文件 -->
        <plugin type="org.mybatis.generator.plugins.UnmergeableXmlMappersPlugin"/>

        <!-- 注意一下 这个commentGenerator放置的顺序，它一定时要在 property 和 plugin 后面的 -->
        <commentGenerator type="com.mdl.mbg.generator.CommentGenerator">
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="true"/>
            <property name="suppressDate" value="true"/>
            <property name="addRemarkComments" value="true"/>
            <!-- 此处设置属性为true，在CommentGenerator.addRootComment中会用到 -->
            <property name="replaceNamespace" value="true"/>
        </commentGenerator>

        <jdbcConnection driverClass="${jdbc.driverClass}"
                        connectionURL="${jdbc.connectionURL}"
                        userId="${jdbc.userId}"
                        password="${jdbc.password}">
            <!--解决mysql驱动升级到8.0后不生成指定数据库代码的问题-->
            <property name="nullCatalogMeansCurrent" value="true"/>
        </jdbcConnection>

        <!--windows是右斜杠"\"，mac和linux是左斜杠"/"-->
        <!-- model.java文件存放路径 -->
        <javaModelGenerator targetPackage="com.mdl.mbg.model" targetProject="mbg-ext/src/main/java"/>

        <!-- xml文件存放路径 -->
        <sqlMapGenerator targetPackage="com.mdl.mbg.mapper" targetProject="mbg-ext/src/main/resources"/>

        <!-- mapper.java文件存放路径 -->
        <javaClientGenerator type="XMLMAPPER" targetPackage="com.mdl.mbg.mapper" targetProject="mbg-ext/src/main/java"/>

        <!--生成全部表tableName设为%-->
        <table tableName="bi_resume" domainObjectName="BiResumeEntity" mapperName="BiResumeMapper" enableCountByExample="false" enableDeleteByExample="false" enableSelectByExample="false" enableUpdateByExample="false">
            <generatedKey column="id" sqlStatement="MySql" identity="true"/>
        </table>

    </context>
</generatorConfiguration>

```


## 模块一（mbg）

1.需要在plugins中加入mybatisgenerator插件
```
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.5</version>
    <dependencies>
        <dependency>
            <groupId> mysql</groupId>
            <artifactId> mysql-connector-java</artifactId>
            <version> 5.1.39</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.5</version>
        </dependency>
    </dependencies>
    <executions>
        <execution>
            <id>Generate MyBatis Artifacts</id>
            <phase>package</phase>
            <goals>
                <goal>generate</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <!--允许移动生成的文件 -->
        <verbose>true</verbose>
        <!-- 是否覆盖 -->
        <overwrite>true</overwrite>
        <!-- 自动生成的配置 -->
        <configurationFile>
            src/main/resources/mybatis-generator.xml</configurationFile>
    </configuration>
</plugin>

```


2.然后在resources中创建mybatis-generator.xml文件，内容如下

```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE generatorConfiguration PUBLIC
        "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd" >
<generatorConfiguration>
 
    <!-- 本地数据库驱动程序jar包的全路径 -->
    <classPathEntry location="E:\server\MavenRepository\maver_jar\mysql\mysql-connector-java\5.1.43"/>
 
    <context id="context" targetRuntime="MyBatis3">
        <commentGenerator>
            <property name="suppressDate" value="true"/>
            <property name="suppressAllComments" value="true" />
            <!--其中suppressDate是去掉生成日期那行注释，suppressAllComments是去掉所有的注-->
        </commentGenerator>
 
        <!-- 数据库的相关配置 -->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver" connectionURL="jdbc:mysql://localhost:3306/backend" userId="root" password="imwork"/>
 
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"/>
        </javaTypeResolver>
 
        <!-- 实体类生成的位置 -->
        <javaModelGenerator targetPackage="com.demo.model" targetProject="src/main/java">
            <property name="enableSubPackages" value="false"/>
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>
 
        <!-- *Mapper.xml 文件的位置 -->
        <sqlMapGenerator targetPackage="com.demo.mapper" targetProject="src/main/java">
            <property name="enableSubPackages" value="false"/>
        </sqlMapGenerator>
 
        <!-- Mapper 接口文件的位置 -->
        <javaClientGenerator targetPackage="com.demo.dao" targetProject="src/main/java" type="XMLMAPPER">
            <property name="enableSubPackages" value="false"/>
        </javaClientGenerator>
 
        <table tableName="sys_user" domainObjectName="UserDo" enableCountByExample="false" enableDeleteByExample="false" enableSelectByExample="false" enableUpdateByExample="false"/>
    </context>
</generatorConfiguration>
```

详细的介绍点这里--https://blog.csdn.net/zsq520520/article/details/50952830

###### 在maven project下plugins下mybatis-generator插件下的mybatis-generator:generate,截图见/src/resources/images/mybatis-generator.jpg  /src/resources/images/operation.jpg
###### 结果见/src/resources/images/result.jpg
