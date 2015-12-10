package com.alby.dp.strategy.example4;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();

        PaymentContext ctx1 = new PaymentContext("小李",5000,strategyRMB);

        ctx1.payNow();

        PaymentContext ctx2 = new PaymentContext("Petter",5000,strategyDollar);

        ctx2.payNow();

        //测试第一种扩展方式   扩展上下文
        PaymentStrategy strategyCard = new Card();

        PaymentContext ctx3 = new PaymentContext2("01123456","小王",50000,strategyCard);
        ctx3.payNow();

        //测试第二种扩展方式  扩展策略
        PaymentStrategy strategyCard2 = new Card2("01123456");

        PaymentContext ctx4 = new PaymentContext("小张",50000,strategyCard2);
        ctx4.payNow();

    }
}
