package com.alby.dp.strategy.example5;

/**
 * Created by xianwei on 2015/12/10.
 * 把日志记录到数据库
 */
public class DBLog implements LogStrategy{


    @Override
    public void log(String msg) {
        if (msg!=null && msg.trim().length()>5){
            //制造错误
            int a = 5/0;
        }
        System.out.println("现在把 '"+msg+"' 记录到数据库中");
    }
}
