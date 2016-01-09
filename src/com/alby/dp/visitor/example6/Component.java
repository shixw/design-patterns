package com.alby.dp.visitor.example6;

/**
 * Created by xianwei on 2016/1/9.
 * 抽象的组件对象，相当于访问者模式中的元素对象
 */
public abstract class Component {

    //接收访问者的访问
    public abstract void accept(Visitor visitor);

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

}
