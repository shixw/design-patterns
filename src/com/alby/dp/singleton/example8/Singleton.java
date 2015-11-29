package com.alby.dp.singleton.example8;

/**
 * Created by xianwei on 2015/11/29.
 *  Lazy initialzation holder class 模式，
 */
public class Singleton {
    /**
     * 类级的内部类，也就是静态类的成员式内部类，该内部类的实例与外部类的实例没有绑定关系
     * 而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
