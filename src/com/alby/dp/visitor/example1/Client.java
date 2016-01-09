package com.alby.dp.visitor.example1;

public class Client {
    public static void main(String[] args) {

        //创建ObjectStructure
        ObjectStructure os = new ObjectStructure();

        //创建要加入对象结构的元素
        Element eleA = new ConcreteElementA();
        Element eleB = new ConcreteElementB();

        os.addElement(eleA);
        os.addElement(eleB);


        //创建访问者
        Visitor visitor = new ConcreteVisitor1();

        os.handleRequest(visitor);
    }
}
