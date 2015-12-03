package com.alby.dp.mediator.example2;



/**
 * Created by xianwei on 2015/12/3.
 * 同事类的抽象父类
 */
public abstract class Colleague {
    //持有中介对象
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
