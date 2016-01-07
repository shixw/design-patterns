package com.alby.dp.bridge.example3;

/**
 * Created by xianwei on 2016/1/7.
 * 以Email的方式发送普通消息
 */
public class CommonMessageEmail implements Message {
    @Override
    public void send(String message, String toUser) {
        System.out.println("Email的方式,发送消息 "+message+" 给 "+toUser);
    }
}
