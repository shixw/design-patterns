package com.alby.dp.factory.facade.example1;

/**
 * Created by xianwei on 2015/11/27.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //不适用配置文件，就直接使用默认的配置
        //默认 情况下，三层都应该生成，也就是说客户端必须对这
        //些模块都有了解，才能够正确使用它们
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }

}
