package com.alby.dp.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/1.
 * 文本实现
 */
public class TxtBuilder implements Builder {
    private StringBuilder builder = new StringBuilder();
    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        builder.append(ehm.getDeptId()).append(",").append(ehm.getExportDate()).append("\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        //2：拼接文件体的内容
        for (String tblName:mapData.keySet()){
            //先拼接表名
            builder.append(tblName).append("\n");
            //然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)){
                builder.append(edm.getProductId()).append(",").append(edm.getPrice()).append(",").append(edm.getAmount()).append("\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        builder.append(efm.getExprotUser());
    }

    public StringBuilder getResult(){
        return builder;
    }
}
