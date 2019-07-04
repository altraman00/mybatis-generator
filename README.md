# mybatis-generator


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

######在maven project下plugins下mybatis-generator插件下的mybatis-generator:generate,截图见/src/resources/images/mybatis-generator.jpg  /src/resources/images/operation.jpg
######结果见/src/resources/images/result.jpg
