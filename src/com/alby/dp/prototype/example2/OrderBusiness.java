package com.alby.dp.prototype.example2;

/**
 * Created by xianwei on 2015/12/2.
 * 处理订单的业务对象
 */
public class OrderBusiness {

    /**
     * 创建订单的方法
     * @param order 订单的接口对象
     */
    public void saveOrder(OrderApi order){
        //根据业务要求，当订单的预定的产品数量超过1000的时候，就需要把订单拆成两份订单

        //1：判断当前的预定产品数量是否大于1000
        while (order.getOrderProductNum()>1000){
            //2:如果大于，还需要继续拆分
            //2.1：再创建一份订单，跟传入的订单除了数量不一样外，其他都相同
            OrderApi newOrder = null;
            if (order instanceof PersonalOrder){
                PersonalOrder p2 = new PersonalOrder();
                PersonalOrder p1 = (PersonalOrder) order;
                p2.setCustomerName(p1.getCustomerName());
                p2.setProductId(p1.getProductId());
                p2.setOrderProductNum(1000);

                newOrder = p2;
            }else if(order instanceof EnterpriseOrder){
                EnterpriseOrder e2 = new EnterpriseOrder();
                EnterpriseOrder e1 = (EnterpriseOrder) order;
                e2.setEnterpriseName(e1.getEnterpriseName());
                e2.setProductId(e1.getProductId());
                e2.setOrderProductNum(1000);

                newOrder = e2;
            }

            //2.2 原来的订单保留，把数量设置为减少1000
            order.setOrderProductNum(order.getOrderProductNum()-1000);

            //业务处理
            System.out.println("拆分生成订单=="+newOrder);
        }
        //3:不超过，那就直接业务功能处理
        System.out.println("订单=="+order);
    }
}
