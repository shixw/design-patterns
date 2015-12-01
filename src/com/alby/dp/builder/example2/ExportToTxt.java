package com.alby.dp.builder.example2;

import java.util.Collection;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/1.
 * 导出数据到文本文件的对象
 */
public class ExportToTxt {

    /**
     * 导出数据到文本文件
     * @param ehm   文件头的内容
     * @param mapData   数据的内容
     * @param efm 文件为的内容
     */
    public void export(ExportHeaderModel ehm,Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel efm){
        //用来记录最终输出的文件内容
        StringBuilder buffer = new StringBuilder();
        //1：先来拼接文件头的内容
        buffer.append(ehm.getDeptId()).append(",").append(ehm.getExportDate()).append("\n");
        //2：拼接文件体的内容
        for (String tblName:mapData.keySet()){
            //先拼接表名
            buffer.append(tblName).append("\n");
            //然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)){
                buffer.append(edm.getProductId()).append(",").append(edm.getPrice()).append(",").append(edm.getAmount()).append("\n");
            }
        }

        //3：拼接文件尾内容
        buffer.append(efm.getExprotUser());

        //、、、、
        System.out.println("输出的文本文件的内容：\n"+buffer.toString());
    }
}
