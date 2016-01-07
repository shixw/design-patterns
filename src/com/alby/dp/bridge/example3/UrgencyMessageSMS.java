package com.alby.dp.bridge.example3;

/**
 * Created by xianwei on 2016/1/7.
 *
 */
public class UrgencyMessageSMS implements UrgencyMessage {
    @Override
    public Object watch(String messageId) {
        //获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }

    @Override
    public void send(String message, String toUser) {
        message = "加急："+message;
        System.out.println("使用站内短消息发方式，发送消息 "+message+" 给 "+toUser);
    }
}
