package com.alby.dp.bridge.example4;

/**
 * Created by xianwei on 2016/1/7.
 * 特急消息
 */
public class SpecialUrgencyMessage extends AbstractMessage {
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void hurry(String messageId){
        //执行催促的业务，发送催促的信息
    }

    public void sendMessage(String message, String toUser) {
        message = "特急："+message;
        super.sendMessage(message, toUser);

        //还需增加一条特急催促的信息
    }
}
