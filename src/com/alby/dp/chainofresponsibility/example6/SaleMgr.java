package com.alby.dp.chainofresponsibility.example6;

/**
 * Created by xianwei on 2016/1/5.
 * 真正处理销售的业务功能的职责对象
 */
public class SaleMgr extends SaleHandler{
    public boolean sale(String user,String customer,SaleModel saleModel){

        System.out.println(user+" 保存了 "+customer+" 购买 "+saleModel+" 的销售记录");
        return true;
    }
}
