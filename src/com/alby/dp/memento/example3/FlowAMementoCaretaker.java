package com.alby.dp.memento.example3;

/**
 * Created by xianwei on 2015/12/15.
 * 负责保存模拟运行流程A的对象的备忘录对象
 */
public class FlowAMementoCaretaker {

    //记录被保存的备忘录对象
    private FlowAMockMemento memento = null;

    //保存
    public void saveMemento(FlowAMockMemento memento){
        this.memento = memento;
    }

    //获取
    public FlowAMockMemento retriveMemento(){
        return this.memento;
    }
}
