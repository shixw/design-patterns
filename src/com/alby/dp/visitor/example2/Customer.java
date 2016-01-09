package com.alby.dp.visitor.example2;

/**
 * Created by xianwei on 2016/1/9.
 * 各种客户的父类
 *
 */
public abstract class Customer {

    //客户编号
    private String custormerId;
    //客户名称
    private String name;

    public String getCustormerId() {
        return custormerId;
    }

    public void setCustormerId(String custormerId) {
        this.custormerId = custormerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //客户提出服务请求的方法
    public abstract void serviceRequest();
}
