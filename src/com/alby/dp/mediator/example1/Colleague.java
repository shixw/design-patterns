package com.alby.dp.mediator.example1;

/**
 * Created by xianwei on 2015/12/3.
 * 同事类的抽象父类
 */
public abstract class Colleague {
    /**
     * 持有中介者对象，每一个同事类都知道中介者对象
     */
    private Mediator mediator;

    /**
     * 构造方法传入中介者
     * @param mediator 中介者对象
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 获取当前同事类对应的中介者对象
     * @return 对应的中介者对象
     */
    public Mediator getMediator() {
        return mediator;
    }
}
