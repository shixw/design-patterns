package com.alby.dp.factorymethod.example5;

/**
 * Created by xianwei on 2015/11/29.
 * 客户端使用Creator来创建客户端需要的对象
 */
public abstract class Creator {
    /**
     * 工厂方法，一般不对外，
     * @return 创建产品
     */
    protected abstract Product1 factoryMethod1();

    /**
     * 工厂方法，一般不对外，
     * @return 创建产品
     */
    protected abstract Product2 factoryMethod2();

    /**
     * 创建客户端需要的对象，客户端主要使用产品对象来完成所需要的功能
     * @return 客户端需要的对象
     */
    public Product createProduct(){
        Product1 p1 = factoryMethod1();
        Product2 p2 = factoryMethod2();
        Product p = new ConcreteProduct();
        p.setProduct1(p1);
        p.setProduct1(p2);

        return p;
    }


}
