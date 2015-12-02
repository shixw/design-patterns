package com.alby.dp.prototype.example7;

public class Client {
    public static void main(String[] args) throws Exception {
        Prototype p1 = new ConcretePrototype1();

        PrototypeManager.setPrototype("p1",p1);

        Prototype p3 = PrototypeManager.getPrototype("p1").clone();
    }
}
