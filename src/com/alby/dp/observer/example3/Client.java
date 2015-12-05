package com.alby.dp.observer.example3;

public class Client {
    public static void main(String[] args) {
        NewsPaper suject = new NewsPaper();

        Reader reader1 = new Reader();
        reader1.setName("张三");

        Reader reader2 = new Reader();
        reader2.setName("李四");
        Reader reader3 = new Reader();
        reader3.setName("王五");

        suject.attach(reader1);
        suject.attach(reader2);
        suject.attach(reader3);

        suject.setContent("本期内容为观察者模式");


    }
}
