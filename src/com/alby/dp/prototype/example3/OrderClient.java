package com.alby.dp.prototype.example3;

public class OrderClient {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();

        op.setCustomerName("张三");
        op.setProductId("52222");
        op.setOrderProductNum(2953);

        OrderBusiness ob = new OrderBusiness();

        ob.saveOrder(op);
    }
}
