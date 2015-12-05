package com.alby.dp.observer.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/5.
 * 目标对象
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> readers = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param reader 观察者对象
     */
    public void attach(Observer reader){
        readers.add(reader);
    }
    /**
     * 删除观察者对象
     * @param reader 观察者对象
     */
    public void detach(Observer reader){
        readers.remove(reader);
    }

    /**
     * 通知所有注册的观察者
     */
    protected void notifyObservers(String content){
        for (Observer reader : readers){
            reader.update(content);
        }
    }
}
