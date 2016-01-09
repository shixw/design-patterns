package com.alby.dp.visitor.example1;

/**
 * Created by xianwei on 2016/1/9.
 * 具体的访问者的实现
 */
public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        //把去访问ConcreteElementA时需要执行的功能实现在这里
        //可能需要访问元素已有的功能，比如
        elementA.operationA();

    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        //把去访问ConcreteElementB时需要执行的功能实现在这里
        //可能需要访问元素已有的功能，比如
        elementB.operationB();
    }
}
