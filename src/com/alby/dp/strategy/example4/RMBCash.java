package com.alby.dp.strategy.example4;

/**
 * Created by xianwei on 2015/12/10.
 * 人民币现金支付
 */
public class RMBCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给 " + ctx.getUserName() + " 人民币现金支付 " + ctx.getMoney() + " 元");
    }
}
