package com.alby.dp.prototype.example6;


/**
 * Created by xianwei on 2015/12/2.
 *
 */
public class PersonalOrder implements Cloneable {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private Product product = null;
    public Object clone(){
        PersonalOrder obj = null;
        try {
            obj = (PersonalOrder) super.clone();
            obj.setProduct((Product) this.product.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
