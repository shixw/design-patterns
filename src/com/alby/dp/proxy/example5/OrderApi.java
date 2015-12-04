package com.alby.dp.proxy.example5;

/**
 * Created by xianwei on 2015/12/4.
 * 订单对象的接口定义
 */
public interface OrderApi {
    String getProductName();
    void setProductName(String productName, String user);
    int getOrderNum();
    void setOrderNum(int orderNum, String user);
    String getOrderUser();
    void setOrderUser(String orderUser, String user);
}
