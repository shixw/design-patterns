package com.alby.dp.chainofresponsibility.example6;

/**
 * Created by xianwei on 2016/1/5.
 * 封装销售单的数据
 */
public class SaleModel {

    private String goods;
    private int saleNum;

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

    @Override
    public String toString() {
        return "goods=["+goods+"],salenum=["+saleNum+"]";
    }
}
