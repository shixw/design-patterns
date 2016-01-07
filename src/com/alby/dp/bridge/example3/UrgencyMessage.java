package com.alby.dp.bridge.example3;

/**
 * Created by xianwei on 2016/1/7.
 * 加急消息的抽象接口
 */
public interface UrgencyMessage extends Message {

    /**
     * 监控某消息的处理过程
     * @param messageId 被监控的消息的编号
     * @return 包含被监控的数据对象，这里示意使用Object
     */
    Object watch(String messageId);
}
