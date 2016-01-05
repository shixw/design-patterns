package com.alby.dp.chainofresponsibility.example6;

/**
 * Created by xianwei on 2016/1/5.
 * 商品销售管理模块的业务处理
 */
public class GoodsSaleEbo {

    /**
     * 保存销售信息，本来销售数据时多条，为了演示 简单
     * @param user 操作人员
     * @param customer  客户
     * @param saleModel 销售数据
     * @return 是否保存成功
     */
    public boolean sale(String user,String customer,SaleModel saleModel){

        /**
         * 如果全部在这里处理，顺序为
         * 1. 权限检查
         * 2. 通用数据检查
         * 3. 数据逻辑校验
         *
         *
         * 4. 真正的业务处理
         */


        //通过功能链来做，这里主要负责构建功能链
        SaleSecurityCheck ssc = new SaleSecurityCheck();
        SaleDataCheck sdc = new SaleDataCheck();
        SaleLogicCheck slc = new SaleLogicCheck();
        SaleMgr sd = new SaleMgr();
        ssc.setSuccessor(sdc);
        sdc.setSuccessor(slc);
        slc.setSuccessor(sd);

        //向链上的第一个对象发出处理的请求
        return ssc.sale(user, customer, saleModel);
    }
}
