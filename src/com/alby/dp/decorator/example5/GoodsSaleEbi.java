package com.alby.dp.decorator.example5;

/**
 * Created by xianwei on 2015/12/24.
 * 商品销售管理的业务接口
 */
public interface GoodsSaleEbi {

    //保存销售信息，本来销售数量应该是多条，此处只为演示
    Boolean sale(String user,String customer,SaleModel saleModel);
}
