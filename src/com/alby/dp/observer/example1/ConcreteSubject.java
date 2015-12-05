package com.alby.dp.observer.example1;

/**
 * Created by xianwei on 2015/12/5.
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象
 * 并在自己状态发送变化是，通知各个观察者
 */
public class ConcreteSubject extends Subject{

    private String subjectState;

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;

        //状态发生了改变，通知各个观察者
        this.notifyObservers();
    }

    public String getSubjectState() {
        return subjectState;
    }
}
