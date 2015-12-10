package com.alby.dp.strategy.example4;

/**
 * Created by xianwei on 2015/12/10.
 * 支付到银行卡
 */
public class Card implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        //这个心的算法自己知道要使用扩展的支付上下文
        PaymentContext2 ctx2 = (PaymentContext2) ctx;

        System.out.println("现在给 " + ctx2.getUserName() + " 的 " + ctx2.getAccout() + " 卡号支付了 " + ctx2.getMoney() + " 元");
    }
}
