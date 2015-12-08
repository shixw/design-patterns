package com.alby.dp.composite.example5;

import java.util.List;

/**
 * Created by xianwei on 2015/12/8.
 * 抽象的组件对象，安全性的实现方式
 */
public abstract class Component {
    //记录福组件的对象
    private Component parent = null;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    //返回某个组件的子组件对象
    public List<Component> getChildren(){
        throw  new UnsupportedOperationException("对象不支持这个功能");
    }
    //想组合对象中加入组件对象
    public void addChild(Component child){
        //缺省的实现，抛出例外，因为叶子对象没有这个功能，或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    //从组合对象中移除组件对象
    public void removeChild(Component child){
        //缺省的实现，抛出例外，因为叶子对象没有这个功能，或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    //返回某个索引对应的组件对象
    public Component getChildren(int index){
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    abstract void printStruct(String preStr);
}
