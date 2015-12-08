package com.alby.dp.composite.example2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2015/12/8.
 * 组合对象，包含其他组合对象或者叶子对象
 */
public class Composite {

    //子组合对象
    private Collection<Composite> childComposite = new ArrayList<Composite>();
    //叶子集合
    private Collection<Leaf> childLeaf = new ArrayList<Leaf>();

    private String name = "";

    //向组合对象加入被他包含的
    public Composite(String name) {
        this.name = name;
    }

    public void addComposite(Composite composite){
        this.childComposite.add(composite);
    }

    public void addLeaf(Leaf leaf){
        this.childLeaf.add(leaf);
    }

    /**
     * 输出组合对象自身的结构
     * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
    public void printStruct(String preStr){
        System.out.println(preStr+"+"+this.name);
        preStr += " ";
        for (Leaf leaf : childLeaf) {
            leaf.printStruct(preStr);
        }

        for (Composite composite : childComposite) {
            //递归输出每个子对象
            composite.printStruct(preStr);
        }
    }
}
