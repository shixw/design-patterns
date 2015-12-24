package com.alby.dp.decorator.example5;

/**
 * Created by xianwei on 2015/12/24.
 * 封装销售单的数据
 */
public class SaleModel {

    //商品
    private String goods;

    //数量
    private int saleNum;

    @Override
    public String toString() {
        return "["+"goods:"+goods+",salenum:"+saleNum+"]";
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }
}
