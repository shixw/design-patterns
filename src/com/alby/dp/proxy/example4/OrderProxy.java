package com.alby.dp.proxy.example4;

/**
 * Created by xianwei on 2015/12/4.
 * 订单的代理对象
 */
public class OrderProxy implements OrderApi {
    private Order order = null;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if(user!=null&&user.equals(this.getOrderUser())){
            order.setProductName(productName,user);
        }else
            System.out.println(user+",无权限修改");
    }

    @Override
    public int getOrderNum() {
        return order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if(user!=null&&user.equals(this.getOrderUser())){
            order.setOrderNum(orderNum, user);
        }else
            System.out.println(user+",无权限修改");
    }

    @Override
    public String getOrderUser() {
        return order.getOrderUser();
    }

    @Override
    public String toString() {
        return order.toString();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user!=null&&user.equals(this.getOrderUser())){
            order.setOrderUser(orderUser, user);
        }else
            System.out.println(user+",无权限修改");
    }
}
