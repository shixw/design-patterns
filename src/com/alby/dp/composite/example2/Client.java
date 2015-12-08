package com.alby.dp.composite.example2;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("服装");

        Composite c1 = new Composite("男装");
        Composite c2 = new Composite("女装");

        Leaf leaf1 = new Leaf("衬衣");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");

        root.addComposite(c1);
        root.addComposite(c2);

        c1.addLeaf(leaf1);
        c1.addLeaf(leaf2);

        c2.addLeaf(leaf3);
        c2.addLeaf(leaf4);

        root.printStruct("");
    }
}
