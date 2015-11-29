package com.alby.dp.factorymethod.example2;

/**
 * Created by xianwei on 2015/11/29.
 * 导出Txt文件实现
 */
public class ExportTxtFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据 = [" + data + "] 到文本文件");
        return true;
    }
}
