package com.alby.dp.observer.example2;

/**
 * Created by xianwei on 2015/12/5.
 * 报纸对象，具体的目标实现
 */
public class NewsPaper extends Subject {

    private String content;

    public String getContent() {
        return content;
    }

    //设置报纸的具体内容，相当于要出版报纸了
    public void setContent(String content) {
        this.content = content;

        //通知所有的读者
        notifyObservers();
    }
}
