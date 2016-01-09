package com.alby.dp.visitor.example1;

/**
 * Created by xianwei on 2016/1/9.
 * 具体元素的实现对象
 */
public class ConcreteElementA extends Element {

    @Override
    void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitConcreteElementA(this);
    }

    //表示元素已有的功能实现
    public void operationA(){
        //已有的功能实现
    }
}
