package com.alby.dp.factory.simplefactory;

/**
 * Created by xianwei on 2015/11/26.
 * 客户端，使用Api接口
 */
public class Client {
    public static void main(String[] args) {
        //通过简单工厂类获取接口对象
        Api api = Factory.createApi(2);
        api.operation("正在使用简单工厂");
    }
}
