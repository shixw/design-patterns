package com.alby.dp.prototype.example3;

/**
 * Created by xianwei on 2015/12/2.
 * 企业订单
 */
public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderProductNum = 0;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(this.enterpriseName);
        order.setOrderProductNum(this.orderProductNum);
        order.setProductId(this.productId);
        return order;
    }

    @Override
    public String toString() {
        return "本企业订单的订购企业是=" + this.enterpriseName + ",订购产品是=" + this.productId + ",订购数量为=" + this.orderProductNum;
    }
}
