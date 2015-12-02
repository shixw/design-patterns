package com.alby.dp.prototype.example4;

class Client {
    public static void main(String[] args) {
        PersonalOrder oa1 = new PersonalOrder();

        oa1.setOrderProductNum(1000);

        System.out.println("这是第一次：" + oa1.getOrderProductNum());

        PersonalOrder oa2 = (PersonalOrder) oa1.clone();

        oa2.setOrderProductNum(80);

        System.out.println("这是第一次：" + oa1.getOrderProductNum());

        System.out.println("克隆：" + oa2.getOrderProductNum());


    }
}
