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
     * 4、重写contextGenerateAdditionalXmlFiles方法，新增mapper.xml扩展文件
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
     * 创建自定义的根据字段条件查询的sql
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
     * 创建mapper.java中的方法
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





    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(File.separator);
        String filePath = "/Users/admin/Documents/workspace/open_source_project";
        String fileName = "aaa.java";
        String fileStr = filePath + File.separator + fileName;
        System.out.println(fileStr);
    }

}
