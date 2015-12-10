package com.alby.dp.strategy.example4;

/**
 * Created by xianwei on 2015/12/10.
 * 美元现金支付
 */
public class DollarCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给 " + ctx.getUserName() + " 美元支付 " + ctx.getMoney() + " 元");
    }
}
