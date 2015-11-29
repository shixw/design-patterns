package com.alby.dp.singleton.example1;

/**
 * Created by xianwei on 2015/11/29.
 * 单例模式(懒汉式)
 */
public class Singleton {

    /**
     * 定义一个变量来存储创建好的类实例
     * 因为这个变量要在静态方法中使用，所以需要加上static修饰
     */
    private static Singleton uniqueInstance = null;

    /**
     * 私有化构造方法，好在内部控制创建实例的数目
     */
    private Singleton() {

    }

    /**
     * 定义一个方法来为客户端提供类的实例
     *
     * @return 一个类的实例
     */
    public static synchronized Singleton getInstance() {
        //判断存储实例的变量是否有值
        if (uniqueInstance == null) {
            //如果没有，就创建一个类的实例，并把值赋值给存储类实例的变量
            uniqueInstance = new Singleton();
        }
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
