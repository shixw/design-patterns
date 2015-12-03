package com.alby.dp.mediator.example1;

/**
 * Created by xianwei on 2015/12/3.
 * 具体的同事类A
 */
public class ConcreteColleagueB extends Colleague {
    /**
     * 构造方法传入中介者
     *
     * @param mediator 中介者对象
     */
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    /**
     * 执行牟雪业务功能
     */
    public void someOperation(){
        //在需要跟其他同事通信的时候，通知中介者对象
        getMediator().change(this);
    }
}
