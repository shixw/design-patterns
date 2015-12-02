package com.alby.dp.prototype.example1;

/**
 * Created by xianwei on 2015/12/2.
 * 使用原型的客户端
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    /**
     * 构造方法，传入需要使用的原型接口对象
     * @param prototype 需要使用的原型接口对象
     */
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    /**
     * 执行某个功能操作
     */
    public void operation(){
        //会需要创建原型接口对象
        Prototype newPrototype = prototype.clone();
    }
}
