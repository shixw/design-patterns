package com.alby.dp.bridge.example2;

/**
 * Created by xianwei on 2016/1/7.
 * 以站内短消息的方式发送普通消息
 */
public class CommonMessageSMS implements Message{
    @Override
    public void send(String message, String toUser) {
        System.out.println("站内短消息的方式,发送消息 "+message+" 给 "+toUser);
    }
}
