package com.alby.dp.strategy.example4;

/**
 * Created by xianwei on 2015/12/10.
 *  支付工资的上下文，每个人的工资不同，支付方式不同
 */
public class PaymentContext {

    //支付给谁
    private String userName = null;
    //支付金额
    private double money = 0.0;

    //支付工资的方法的策略的接口
    private PaymentStrategy strategy = null;

    //构造方法，传入被支付工资的人员，金额和具体支付策略
    public PaymentContext(String userName, double money, PaymentStrategy strategy) {
        this.userName = userName;
        this.money = money;
        this.strategy = strategy;
    }

    public void payNow(){
        this.strategy.pay(this);
    }

    public String getUserName() {
        return userName;
    }

    public double getMoney() {
        return money;
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }
}
