package com.alby.dp.prototype.example5;

public class Client {
    public static void main(String[] args) {
        PersonalOrder oa1 = new PersonalOrder();

        Product product = new Product();

        product.setId("222");
        product.setName("dasdas");

        oa1.setProduct(product);
        //...

    }
}
