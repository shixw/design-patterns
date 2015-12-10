package com.alby.dp.strategy.example3;

/**
 * Created by xianwei on 2015/12/10.
 * 具体算法实现，为新客户或者是普通客户计算应报的价格
 */
public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新客户或者普通客户，没有折扣");
        return goodsPrice;
    }
}
