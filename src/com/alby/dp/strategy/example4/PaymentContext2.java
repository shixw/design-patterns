package com.alby.dp.strategy.example4;

/**
 * Created by xianwei on 2015/12/10.
 * 扩展的支付上下文对象
 */
public class PaymentContext2 extends PaymentContext {
    //银行卡号
    private String accout = null;

    public PaymentContext2(String accout, String userName, double money, PaymentStrategy strategy) {
        super(userName, money, strategy);
        this.accout = accout;
    }

    public String getAccout() {
        return accout;
    }
}
