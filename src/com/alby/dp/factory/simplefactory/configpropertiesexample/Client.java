package com.alby.dp.factory.simplefactory.configpropertiesexample;

import com.alby.dp.factory.simplefactory.Api;

/**
 * Created by xianwei on 2015/11/26.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.operation("hello");
    }
}
