package com.alby.dp.observer.example1;

/**
 * Created by xianwei on 2015/12/5.
 * 具体观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {
    //观察者状态
    private String observerState;
    @Override
    public void update(Subject subject) {
        //具体的更新实现
        //这里可能需要更新观察者的状态，使其与目标的状态保持一致
        observerState = ((ConcreteSubject)subject).getSubjectState();

    }
}
