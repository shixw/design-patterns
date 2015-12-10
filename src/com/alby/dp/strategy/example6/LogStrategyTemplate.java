package com.alby.dp.strategy.example6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xianwei on 2015/12/10.
 * 实现日志策略的抽象模板，实现给消息添加时间
 */
public abstract class LogStrategyTemplate implements LogStrategy{

    public final void log(String msg){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //给消息添加时间
        msg = df.format(new Date())+" 内容是："+msg;
        //真正执行日志记录
        doLog(msg);
    }
    protected abstract void doLog(String msg);
}
