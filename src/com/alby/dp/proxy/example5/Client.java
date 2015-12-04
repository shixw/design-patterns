package com.alby.dp.proxy.example5;



public class Client {
    public static void main(String[] args) {
        Order order = new Order("设计模式",200,"战三");
        DynamicProxy proxy = new DynamicProxy();
        OrderApi orderApi = proxy.getProxyInterface(order);


        orderApi.setOrderNum(123, "历史");

        System.out.println(orderApi);

        orderApi.setOrderNum(222223, "战三");

        System.out.println(orderApi);
    }
}
