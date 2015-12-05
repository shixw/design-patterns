package com.alby.dp.observer.example4;

import java.util.Observable;

/**
 * Created by xianwei on 2015/12/5.
 * 报纸对象，具体的目标实现
 */
public class NewsPaper extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    //设置报纸的具体内容，相当于要出版报纸了
    public void setContent(String content) {
        this.content = content;

        //在使用Java中的Observer模式中，必须有这个话
        this.setChanged();
        //通知所有的读者
        //自动将当前对象传过去，表示拉取
//        this.notifyObservers();
        //推送
        this.notifyObservers(this.content);
    }
}
