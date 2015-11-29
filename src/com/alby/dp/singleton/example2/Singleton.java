package com.alby.dp.singleton.example2;

/**
 * Created by xianwei on 2015/11/29.
 * 饿汉式单例实现
 */
public class Singleton {

    /**
     * 定义一个变量来存储类的实例，直接在这里创建好类的实例，只会创建一次
     */
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation() {
        //功能处理
    }

    /**
     * 单例可以有自己的属性
     */
    private String singletonData;

    /**
     * 让外部通过这些方法来访问属性的值
     *
     * @return 属性的值
     */
    public String getSingletonData() {
        return singletonData;
    }
}
