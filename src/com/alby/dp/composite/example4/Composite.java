package com.alby.dp.composite.example4;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/8.
 * 组合对象，通常需要存储子对象，定义有子部件的部件行为，
 * 并实现Component里面定义与子部件有关的操作
 */
public class Composite extends Component {
    //用来存储组合对象中包含的子组件对象
    private List<Component> childComponents = null;

    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    public void addChild(Component child) {
        //延迟初始化
        if (childComponents == null){
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
    }


    @Override
    void printStruct(String preStr) {
        System.out.println(preStr+"+"+this.name);
        if (this.childComponents != null){
            preStr += preStr;
            for (Component childComponent : childComponents) {
                childComponent.printStruct(preStr);
            }
        }
    }

}
