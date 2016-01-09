package com.alby.dp.visitor.example6;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component c1 = new Composite("c1");
        Component c2 = new Composite("c2");

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf1");
        Component leaf3 = new Leaf("leaf1");

        root.addChild(c1);
        root.addChild(c2);
        root.addChild(leaf1);

        c1.addChild(leaf2);
        c2.addChild(leaf3);


        ObjectStructure os = new ObjectStructure();

        os.setRoot(root);

        PrintStructVisitor pnv = new PrintStructVisitor();

        os.handleRequest(pnv);
    }
}
