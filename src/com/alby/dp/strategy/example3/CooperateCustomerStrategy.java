package com.alby.dp.strategy.example3;

/**
 * Created by xianwei on 2015/12/10.
 * 具体算法实现，为战略合作客户计算应报的价格
 */
public class CooperateCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于战略合作客户，统一8折");
        return goodsPrice*0.8;
    }
}
