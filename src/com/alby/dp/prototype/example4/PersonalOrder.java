package com.alby.dp.prototype.example4;

import com.alby.dp.prototype.example2.OrderApi;

/**
 * Created by xianwei on 2015/12/2.
 * 个人订单对象
 */
public class PersonalOrder implements OrderApi,Cloneable {
    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
    /**
     * 订购人员姓名
     */
    private String customerName;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public String toString() {
        return "本个人订单的订购人是=" + this.customerName + ",订购产品是=" + this.productId + ",订购数量为=" + this.orderProductNum;
    }
}
