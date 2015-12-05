package com.alby.dp.observer.example5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/5.
 * 定义水质监测的目标对象
 */
public abstract class WaterQualitySubject {
    protected List<WatcherObserver> observers = new ArrayList<WatcherObserver>();

    public void attach(WatcherObserver observer){
        observers.add(observer);
    }
    public void detach(WatcherObserver observer){
        observers.remove(observer);
    }
    //获取水质污染的级别
    public abstract int getPolluteLevel();

}
