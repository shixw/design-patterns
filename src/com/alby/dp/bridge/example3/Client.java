package com.alby.dp.bridge.example3;

public class Client {
    public static void main(String[] args) {
        Message m = new CommonMessageSMS();
        m.send("aa","a");

        m = new CommonMessageEmail();
        m.send("ee","ee");

        m = new UrgencyMessageSMS();
        m.send("asd","dd");
    }
}
