package com.alby.dp.factorymethod.example3;

/**
 * Created by xianwei on 2015/11/29.
 * 导出数据库文件实现
 */
public class ExportDB implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据 = [" + data + "] 到数据库备份文件");
        return true;
    }
}
