package com.alby.dp.prototype.example5;

/**
 * Created by xianwei on 2015/12/2.
 *
 */
public class PersonalOrder implements OrderApi{
    private String customerName;
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    public ProductPrototype getProduct() {
        return product;
    }

    public void setProduct(ProductPrototype product) {
        this.product = product;
    }

    private ProductPrototype product = null;
    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setOrderProductNum(this.orderProductNum);
        order.setProduct(this.product.cloneProduct());
        return order;
    }
}
