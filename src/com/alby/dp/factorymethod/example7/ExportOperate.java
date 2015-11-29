package com.alby.dp.factorymethod.example7;

/**
 * Created by xianwei on 2015/11/29.
 * 实现导出数据业务功能对象
 */
public class ExportOperate {
    /**
     * 导出文件
     *
     * @param data 需要保存的数据
     * @return 是否成功导出文件
     */
    public boolean export(int type,String data) {
        //先完成各种导出数据前的准备工作

        System.out.println("now 进行数据校验");
        System.out.println("now 进行数据转换");
        System.out.println("now 进行数据格式的封装");

        //然后才进行真正的导出
        ExportFileApi api = factoryMethod(type);
        return api != null && api.export(data);
    }

    /**
     * 工厂方法，创建导出的文件的对象的接口对象
     * @return  导出的文件对象的接口对象
     */
    protected ExportFileApi factoryMethod(int type){
        ExportFileApi api = null;
        if(type==1){
            api = new ExportTxtFile();
        }else if (type==2){
            api = new ExportDB();
        }
        return api;
    }
}
