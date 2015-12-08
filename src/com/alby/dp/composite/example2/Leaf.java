package com.alby.dp.composite.example2;

/**
 * Created by xianwei on 2015/12/8.
 * 叶子对象
 */
public class Leaf {
    //叶子对象的名字
    private String name = "";

    //构造方法传入名字
    public Leaf(String name) {
        this.name = name;
    }

    //输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象名字、
    //preStr 前缀，主要是按照层级机构的空格，实现向后的缩进
    public void printStruct(String preStr){
        System.out.println(preStr+"-"+name);
    }
}
