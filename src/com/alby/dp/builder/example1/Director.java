package com.alby.dp.builder.example1;

/**
 * Created by xianwei on 2015/12/1.
 * 指导者，指导使用构建器的接口来构建产品的对象
 */
public class Director {

    /**
     * 持有当前需要使用的构建器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入构造器对象
     * @param builder 构造器对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 知道构建器构建最终的产品对象
     */
    public void construct(){
        //通过使用构建器接口来构建最终的产品对象
        builder.buildPart();
    }
}
