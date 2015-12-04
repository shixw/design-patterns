package com.alby.dp.proxy.example1;

/**
 * Created by xianwei on 2015/12/4.
 * 具体目标对象，是真正被代理的对象
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        //执行具体的功能处理
    }
}
