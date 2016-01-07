package com.alby.dp.bridge.example2;

/**
 * Created by xianwei on 2016/1/7.
 * 消息统一接口
 */
public interface Message {

    /**
     * 发送消息
     * @param message 要发送的消息内容
     * @param toUser    把消息发送到目的人员
     */
    public void send(String message,String toUser);
}
