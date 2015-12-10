package com.alby.dp.strategy.example3;

/**
 * Created by xianwei on 2015/12/10.
 * 具体算法实现，为大客户计算应报的价格
 */
public class LargeCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice*(1-0.01);
    }
}
