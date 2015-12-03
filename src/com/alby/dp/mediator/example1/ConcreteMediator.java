package com.alby.dp.mediator.example1;

/**
 * Created by xianwei on 2015/12/3.
 *
 */
public class ConcreteMediator implements Mediator{
    /**
     * 持有并维护同事A
     */
    private ConcreteColleagueA colleagueA;
    /**
     * 持有并维护同事B
     */
    private ConcreteColleagueB colleagueB;

    /**
     * 设置中介者需要了解并维护的同事A对象
     * @param colleagueA 同事A对象
     */
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }
    /**
     * 设置中介者需要了解并维护的同事B对象
     * @param colleagueB 同事B对象
     */
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void change(Colleague colleague) {
        //某个同事类发送变化，通常需要与其他同事交互
        //具体协调相应的同事对象来实现协作行为
    }
}
