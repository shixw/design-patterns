package com.alby.dp.chainofresponsibility.example5;

/**
 * Created by xianwei on 2016/1/5.
 * 通用的请求对象
 */
public class RequestModel {

    //具体的业务类型
    private String type;

    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
