package com.alby.dp.factorymethod.example2;

/**
 * Created by xianwei on 2015/11/29.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate eo = new ExportOperate();
        eo.export(1,"sadasd");
    }
}
