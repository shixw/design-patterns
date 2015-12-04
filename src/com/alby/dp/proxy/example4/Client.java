package com.alby.dp.proxy.example4;

public class Client {
    public static void main(String[] args) {
        OrderApi order = new OrderProxy(new Order("设计模式",200,"战三"));

        order.setOrderNum(123, "历史");

        System.out.println(order);

        order.setOrderNum(222223, "战三");

        System.out.println(order);
    }
}
