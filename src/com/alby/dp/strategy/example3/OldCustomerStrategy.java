package com.alby.dp.strategy.example3;

/**
 * Created by xianwei on 2015/12/10.
 * 具体算法实现，为老客户计算应报的价格
 */
public class OldCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice*(1-0.05);
    }
}
