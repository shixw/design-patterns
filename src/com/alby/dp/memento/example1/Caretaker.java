package com.alby.dp.memento.example1;

/**
 * Created by xianwei on 2015/12/15.
 * 负责保存备忘录的对象
 */
public class Caretaker {

    //保存备忘录的对象
    private Memento memento = null;

    //保存备忘录对象
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
    //获取被保存的备忘录对象
    public Memento retriveMemento(){
        return this.memento;
    }
}
