package com.alby.dp.strategy.example5;

/**
 * Created by xianwei on 2015/12/10.
 * 把日志记录到文件中
 */
public class FileLog implements LogStrategy{
    @Override
    public void log(String msg) {
        System.out.println("现在把 '"+msg+"' 记录到文件中");
    }
}
