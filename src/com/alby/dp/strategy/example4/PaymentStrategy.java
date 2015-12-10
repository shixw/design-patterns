package com.alby.dp.strategy.example4;

/**
 * Created by xianwei on 2015/12/10.
 * 支付的策略的接口，公司有多重支付工资的算法
 * 比如：现金、银行卡、现金加股票、现金加期权、美元支付等
 */
public interface PaymentStrategy {

    /**
     * 公司给某人真正支付的工资
     * @param ctx 支付工资的上下文，里面包含算法需要的数据
     */
    void pay(PaymentContext ctx);
}
