package com.alby.dp.strategy.example3;

public class Client2 {
    public static void main(String[] args) {
        //1:选择并创建需要使用的策略对象
        Strategy strategy = new CooperateCustomerStrategy();
//创建上下文
        Price price = new Price(strategy);
//计算报价
        double quote = price.quote(10000);

        System.out.println("向客户报价：" + quote);
    }
}
