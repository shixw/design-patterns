package com.alby.dp.strategy.example3;

/**
 * Created by xianwei on 2015/12/10.
 * 价格管理，主要完成计算向客户所报价格的功能
 */
public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    //报价，计算客户的报价
    public double quote(double goodsPrice){
        return this.strategy.calcPrice(goodsPrice);
    }
}
