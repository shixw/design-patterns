package com.alby.dp.adapter.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/11/28.
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
        LogFileOperateApi fileApi = new LogFileOperate("");

        LogDbOperateApi api = new Adapter(fileApi);
        //保存日志文件
        api.createLog(lm1);

        //读取日志文件的内容
        List<LogModel> readLog = api.getAlllog();

        System.out.println("readLog = [" + readLog + "]");
    }
}
