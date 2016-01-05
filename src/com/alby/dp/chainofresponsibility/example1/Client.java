package com.alby.dp.chainofresponsibility.example1;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setSuccessor(h2);

        h1.handlerRequest();
    }
}
