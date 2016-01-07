package com.alby.dp.bridge.example1;

/**
 * Created by xianwei on 2016/1/7.
 * 定义抽象部分的接口
 */
public abstract class Abstraction {

    //持有一个实现部分的对象
    protected Implementor impl;

    //抽纸方法，传入实现部分的对象
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    //示例操作，实现一定的功能，可能需要转调实现部分的具体实现方法
    public void operation(){
        impl.operationImpl();
    }
}
