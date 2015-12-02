package com.alby.dp.prototype.example5;

/**
 * Created by xianwei on 2015/12/2.
 * 产品对象
 */
public class Product implements ProductPrototype {
    private String name;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=="+this.name+",id=="+this.id;
    }

    @Override
    public ProductPrototype cloneProduct() {
        Product product = new Product();
        product.setId(this.id);
        product.setName(this.name);
        return product;
    }
}
