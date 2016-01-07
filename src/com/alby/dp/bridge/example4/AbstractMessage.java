package com.alby.dp.bridge.example4;

/**
 * Created by xianwei on 2016/1/7.
 * 抽象的消息对象
 */
public abstract class AbstractMessage {

    //持有一个实现部分的对象
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    //发送消息
    public void sendMessage(String message,String toUser){
        this.impl.send(message, toUser);
    }
}
