package com.alby.dp.visitor.example5;


/**
 * Created by xianwei on 2015/12/8.
 * 叶子对象，叶子对象不再包含其他子对象
 */
public class Leaf extends Component {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLeaf(this);
    }

    //叶子对象的名字
    private String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
