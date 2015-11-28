package com.alby.dp.adapter.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/11/29.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //准备日志内容，也就是测试数据
        LogModel lm1 = new LogModel();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2015-10-22 10:09:32");
        lm1.setLogContent("this is a test log!!");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lm1);

        //创建操作日志文件的对象
        LogFileOperateApi fileOperateApi = new LogFileOperate("");
        LogDbOperateApi dbOperateApi = new LogDbOperate();

        LogFileOperateApi fileOperateApi2 = new TwoDirectAdapter(dbOperateApi,fileOperateApi);
        LogDbOperateApi dbOperateApi2 = new TwoDirectAdapter(dbOperateApi,fileOperateApi);

        //测试从文件操作适配到第二版
        dbOperateApi2.createLog(lm1);
        List<LogModel> allLog = dbOperateApi2.getAlllog();
        System.out.println("allLog = [" + allLog + "]");

        System.out.println("---------------------------->file api");

        fileOperateApi2.writeLogFile(list);
        fileOperateApi.readLogFile();
    }
}
