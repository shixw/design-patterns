package com.alby.dp.singleton.example9;

/**
 * Created by xianwei on 2015/11/29.
 * 使用枚举来实现单例
 */
public enum  Singleton {

    /**
     * 定义一个枚举的元素，他就代表了Singleton的一个实例
     */
    uniqueInstance;

    /**
     * 可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    }
}
