package com.alby.dp.bridge.example4;

public class Client {
    public static void main(String[] args) {
        MessageImplementor impl = new MessageSMS();

        AbstractMessage m = new CommonMessage(impl);

        m.sendMessage("请喝一杯茶","小李");

        m = new UrgencyMessage(impl);

        m.sendMessage("请喝一杯茶","小李");

        impl = new MessageEmail();

        m = new CommonMessage(impl);

        m.sendMessage("请喝一杯茶","小李");

        m = new UrgencyMessage(impl);

        m.sendMessage("请喝一杯茶","小李");

        //特急消息和手机发送

        impl = new MessageMobile();

        m = new CommonMessage(impl);

        m.sendMessage("请喝一杯茶","小李");

        m = new UrgencyMessage(impl);

        m.sendMessage("请喝一杯茶","小李");

        m = new SpecialUrgencyMessage(impl);

        m.sendMessage("请喝一杯茶","小李");

    }
}
