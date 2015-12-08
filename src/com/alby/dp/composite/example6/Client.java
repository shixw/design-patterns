package com.alby.dp.composite.example6;


public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("服装");

        Composite c1 = new Composite("男装");
        Composite c2 = new Composite("女装");
        Composite c3 = new Composite("男装");
        root.addChild(c1);
        c1.addChild(c2);

        root.printStruct("  ");

        System.out.println(root.getComponentPath());
        System.out.println(c2.getComponentPath());
    }
}
