package com.alby.dp.proxy.example4;

/**
 * Created by xianwei on 2015/12/4.
 * 真实的订单对象
 */
public class Order implements OrderApi {
    private String productName;
    private int orderNum;
    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String toString() {
        return "productName=" + this.productName + ",orderNum=" + this.orderNum + ",orderUser=" + this.orderUser;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return this.orderNum;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String getOrderUser() {
        return this.orderUser;
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }
}
