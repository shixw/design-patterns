package com.alby.dp.decorator.example5;

/**
 * Created by xianwei on 2015/12/24.
 * 装饰器的接口，需要跟被装饰的对象实现相同的接口
 */
public abstract class Decorator implements GoodsSaleEbi{

    //持有被装饰的对象
    protected GoodsSaleEbi ebi;

    public Decorator(GoodsSaleEbi ebi) {
        this.ebi = ebi;
    }
}
