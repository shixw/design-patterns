package com.alby.dp.bridge.example4;

/**
 * Created by xianwei on 2016/1/7.
 * 加急消息
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser) {
        message = "加急："+message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        //获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }
}
