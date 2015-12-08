package com.alby.dp.composite.example4;



/**
 * Created by xianwei on 2015/12/8.
 * 叶子对象，叶子对象不再包含其他子对象
 */
public class Leaf extends Component {
    private String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr+"-"+name);
    }
}
