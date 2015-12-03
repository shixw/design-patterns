package com.alby.dp.mediator.example2;

/**
 * Created by xianwei on 2015/12/3.
 * 光驱类，一个同事类
 */
public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData() {
        return data;
    }

    public void readCD(){
        //逗号前是视频显示的数据，逗号后是声音
        this.data = "设计模式,中介者模式";
        //通知主板自己的状态发送了改变
        this.getMediator().changed(this);
    }
}

