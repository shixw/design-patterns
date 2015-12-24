package com.alby.dp.decorator.example5;

public class GoodsSaleEbo implements GoodsSaleEbi{
    @Override
    public Boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println(user+" 保存了 "+customer+" 购买"+saleModel+" 的销售结果");
        return true;
    }
}
