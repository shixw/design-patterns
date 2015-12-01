package com.alby.dp.builder.example2;

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

        ExportToTxt toTxt = new ExportToTxt();
        toTxt.export(ehm,mapData,efm);

        ExportToXml toXml = new ExportToXml();
        toXml.export(ehm,mapData,efm);

    }
}
