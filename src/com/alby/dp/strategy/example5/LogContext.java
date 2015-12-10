package com.alby.dp.strategy.example5;

/**
 * Created by xianwei on 2015/12/10.
 * 日志上下文
 */
public class LogContext {
    //记录日志的方法，提供给客户端使用
    public void log(String msg){
        //优先使用策略：记录到数据中
        LogStrategy strategy = new DBLog();

        try {
            strategy.log(msg);
        }catch (Exception err){
            //出错了 ，那就记录到文件中
            strategy = new FileLog();
            strategy.log(msg);
        }
    }
}
