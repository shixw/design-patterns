package com.alby.dp.proxy.example1;

/**
 * Created by xianwei on 2015/12/4.
 * 代理对象
 */
public class Proxy implements Subject {

    /**
     * 持有被代理的具体的目标对象
     */
    private RealSubject realSubject = null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param realSubject 被代理的具体的目标对象
     */
    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //在转调具体的目标对象钱，可以执行一些功能处理

        //转调具体的目标对象的方法
        realSubject.request();

        //在转调具体的目标对象后，可以执行一些功能处理
    }
}
