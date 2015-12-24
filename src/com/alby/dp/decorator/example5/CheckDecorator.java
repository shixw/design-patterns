package com.alby.dp.decorator.example5;

/**
 * 实现权限控制
 */
public class CheckDecorator extends Decorator {
    public CheckDecorator(GoodsSaleEbi ebi) {
        super(ebi);
    }

    @Override
    public Boolean sale(String user, String customer, SaleModel saleModel) {
        if (!"张三".equals(user)){//判断张三有权限
            //
            System.out.println("对不起 "+user+" ，你没有保存销售记录的权限");
            return false;
        }else
            return this.ebi.sale(user, customer, saleModel);
    }
}
