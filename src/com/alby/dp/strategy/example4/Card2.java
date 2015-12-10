package com.alby.dp.strategy.example4;

/**
 * Created by xianwei on 2015/12/10.
 * 支付到银行卡
 */
public class Card2 implements PaymentStrategy {
    private String accout = "";

    public Card2(String accout) {
        this.accout = accout;
    }

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给 " + ctx.getUserName() + " 的 "
                + this.accout +
                " 卡号支付了 " + ctx.getMoney() + " 元");
    }
}
