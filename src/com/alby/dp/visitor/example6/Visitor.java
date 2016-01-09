package com.alby.dp.visitor.example6;

/**
 * Created by xianwei on 2016/1/9.
 * 访问组合对象结构的访问者接口
 */
public interface Visitor {

    //访问组合对象，相当于给组合对象添加访问者的功能
     void visitComposite(Composite composite);
    //访问叶子对象，相当于给组合对象添加访问者的功能
     void visitLeaf(Leaf leaf);
}
