package com.alby.dp.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/1.
 * xml格式
 */
public class XmlBuilder implements Builder{
    private StringBuilder builder = new StringBuilder();
    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        builder.append("<?xml version='1.0' encoding='gb2312'?> \n");
        builder.append("<Report>\n");
        builder.append("    <Header>\n");
        builder.append("        <DeptId>").append(ehm.getDeptId()).append("</DeptId>\n");
        builder.append("        <ExportDate>").append(ehm.getExportDate()).append("</ExportDate>\n");
        builder.append("    </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        builder.append("    <Body>\n");
        for (String tblName : mapData.keySet()) {
            //先拼接表名
            builder.append("        <Datas TableName=\"").append(tblName).append("\">\n");
            //然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                builder.append("            <Data>\n");
                builder.append("                <ProductId>").append(edm.getProductId()).append("</ProductId>\n");
                builder.append("                <Price>").append(edm.getPrice()).append("</Price>\n");
                builder.append("                <Amount>").append(edm.getAmount()).append("</Amount>\n");
                builder.append("            </Data>\n");
            }
            builder.append("        </Datas>\n");
        }
        builder.append("    </Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        builder.append("    <Footer>\n");
        builder.append("        <ExportUser>").append(efm.getExprotUser()).append("</ExportUser>\n");
        builder.append("    </Footer>\n");
        builder.append("</Report>\n");
    }

    public StringBuilder getResult(){
        return builder;
    }
}
