package com.alby.dp.builder.example3;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDeptId("一分公司");
        ehm.setExportDate("2015-01-02");

        Map<String,Collection<ExportDataModel>> mapData = new HashMap<String, Collection<ExportDataModel>>();

        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setPrice(200);
        edm2.setAmount(50);

        col.add(edm1);
        col.add(edm2);

        mapData.put("销售记录表", col);

        ExportFooterModel efm = new ExportFooterModel();

        efm.setExprotUser("张三");


        //测试输出到文本文件

        TxtBuilder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(ehm,mapData,efm);

        System.out.println(txtBuilder.getResult());

        //测试输出到xml文件

        XmlBuilder xmlBuilder = new XmlBuilder();
        Director directorxml = new Director(xmlBuilder);
        directorxml.construct(ehm,mapData,efm);

        System.out.println(xmlBuilder.getResult());


    }
}
