package com.alby.dp.decorator.example5;

public class Client {
    public static void main(String[] args) {

        GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodsSaleEbo()));

        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("Moto手机");
        saleModel.setSaleNum(2);

        ebi.sale("张三","张三丰",saleModel);
        ebi.sale("李四","张三丰",saleModel);
    }
}
