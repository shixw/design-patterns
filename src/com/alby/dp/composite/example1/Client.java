package com.alby.dp.composite.example1;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite();
        Component c1 = new Composite();
        Component c2 = new Composite();

        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        root.addChild(c1);
        root.addChild(c2);
        root.addChild(leaf1);

        c1.addChild(leaf2);
        c2.addChild(leaf3);

        Component o = root.getChildren(1);
        System.out.println(o);
    }
}
