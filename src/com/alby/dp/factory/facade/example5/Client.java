package com.alby.dp.factory.facade.example5;

/**
 * Created by xianwei on 2015/11/27.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        FacadeApi api = FacadeFactory.createFacadeApi();
        api.generate();
    }

}
