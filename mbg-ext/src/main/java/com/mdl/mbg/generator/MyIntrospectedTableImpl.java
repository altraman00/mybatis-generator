package com.mdl.mbg.generator;

import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;

/**
 * @Project : mall
 * @Package Name : com.mdl.mbg.generator
 * @Description : 1、写个MyIntrospectedTableImpl类，继承IntrospectedTableMyBatis3Impl，
 * 重写getMyBatis3SqlMapNamespace方法改变生成后的mapper.xml的命名空间
 * @Author : xiekun
 * @Create Date : 2020年05月08日 15:04
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
public class MyIntrospectedTableImpl extends IntrospectedTableMyBatis3Impl {

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


//    /**
//     * 重写getGeneratedJavaFiles自定义sql方法,
//     * 根据文件路径判断文件是否生成，如已存在则不重新生成，避免被覆盖
//     *
//     * @return
//     */
//    @Override
//    public List<GeneratedJavaFile> getGeneratedJavaFiles() {
//        List<GeneratedJavaFile> answer = new ArrayList<GeneratedJavaFile>();
//
//        //保持不变，JavaModel继续生成
//        for (AbstractJavaGenerator javaGenerator : javaModelGenerators) {
//            List<CompilationUnit> compilationUnits = javaGenerator
//                    .getCompilationUnits();
//            for (CompilationUnit compilationUnit : compilationUnits) {
//                GeneratedJavaFile gjf = new GeneratedJavaFile(compilationUnit,
//                        context.getJavaModelGeneratorConfiguration()
//                                .getTargetProject(),
//                        context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING),
//                        context.getJavaFormatter());
//                answer.add(gjf);
//            }
//        }
//
//        //重新构造Java mapper对象，如果xxxMapperExt.java已生成则不再创建
//        for (AbstractJavaGenerator javaGenerator : clientGenerators) {
//            List<CompilationUnit> compilationUnits = javaGenerator.getCompilationUnits();
//
//            for (CompilationUnit compilationUnit : compilationUnits) {
//                //将源文件转换为接口
//                Interface interfazz = (Interface) compilationUnit;
//                String targetProject = context.getJavaClientGeneratorConfiguration().getTargetProject();
//                String targetPackage = context.getJavaClientGeneratorConfiguration().getTargetPackage();
//                String domainObjectName = interfazz.getType().getShortName();
//
//                //判断文件存不存在，如果文件不存在则创建，否则不创建
//                String filePath = targetProject + "." + targetPackage;
//                String fileName = domainObjectName+".java";
//                if (fileIsNotExists(filePath, fileName)) {
//                    Method methed = new Method("findBy");
//                    methed.setVisibility(methed.getVisibility());
//                    methed.setReturnType(new FullyQualifiedJavaType("List<"+domainObjectName+">"));
//                    methed.addParameter(new Parameter(new FullyQualifiedJavaType(domainObjectName),
//                            domainObjectName.substring(0,1).toLowerCase() + domainObjectName.substring(1)));
//                    interfazz.addMethod(methed);
//
//                    GeneratedJavaFile gjf = new GeneratedJavaFile(compilationUnit,
//                            context.getJavaClientGeneratorConfiguration()
//                                    .getTargetProject(),
//                            context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING),
//                            context.getJavaFormatter());
//                    answer.add(gjf);
//                }
//            }
//        }
//        return answer;
//    }
//
//
//    /**
//     * 重写getGeneratedXmlFiles方法，在mapper.xml文件中新增sql语句。isMergeable置为true，否则自己业务写的sql会被覆盖
//     * @return
//     */
//    @Override
//    public List<GeneratedXmlFile> getGeneratedXmlFiles() {
//        List<GeneratedXmlFile> answer = new ArrayList<GeneratedXmlFile>();
//
//        if (this.xmlMapperGenerator != null) {
//            Document document = this.xmlMapperGenerator.getDocument();
//            document.getRootElement().addElement(getSqlMapElement(xmlMapperGenerator.getIntrospectedTable()));
//            GeneratedXmlFile gxf = new GeneratedXmlFile(document,
//                    getMyBatis3XmlMapperFileName(), getMyBatis3XmlMapperPackage(),
//                    context.getSqlMapGeneratorConfiguration().getTargetProject(),
//                    true, context.getXmlFormatter());
//            if (context.getPlugins().sqlMapGenerated(gxf, this)) {
//                answer.add(gxf);
//            }
//        }
//        return answer;
//    }
//
//    private Element getSqlMapElement(IntrospectedTable introspectedTable) {
//
//        String daoPackage = context.getJavaModelGeneratorConfiguration().getTargetPackage();
//        String daoName = introspectedTable.getTableConfiguration().getDomainObjectName();
//
//        //新增一个select方法的节点加到根目录下，指定id，参数，返回类型
//        XmlElement select = new XmlElement("select");
//        select.addAttribute(new Attribute("resultMap","BaseResultMap"));
//        select.addAttribute(new Attribute("id","findBy"));
//        select.addAttribute(new Attribute("parameterType",daoPackage + "." + daoName));
//
//        //新增一个文本节点，拼接sql
//        TextElement selectStr = new TextElement("select <include refid=\"Base_Column_List\" /> from "
//                + introspectedTable.getTableConfiguration().getTableName());
//
//        select.addElement(selectStr);
//        select.addElement(getWhere(introspectedTable));
//        return select;
//    }
//
//    private Element getWhere(IntrospectedTable introspectedTable) {
//        List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();
//        XmlElement where = new XmlElement("where");
//        allColumns.stream().forEach(column -> {
//            XmlElement ifFlag = new XmlElement("if");
//            ifFlag.addAttribute(new Attribute("test",column.getJavaProperty()+" != null"));
//            String andText = "and " + column.getActualColumnName() + " = #{" + column.getJavaProperty() + ",jdbcType=" + column.getJdbcTypeName() + "}";
//            TextElement and = new TextElement(andText);
//            ifFlag.addElement(and);
//            where.addElement(ifFlag);
//        });
//        return where;
//    }
//
//
//    /**
//     * 判断文件存不存在
//     *
//     * @param filePath
//     * @param fileName
//     * @return
//     */
//    private static Boolean fileIsNotExists(String filePath, String fileName) {
//        String fileStr = filePath + File.separator + fileName;
//        File file = new File(fileStr);
//        return !file.exists();
//    }

}
