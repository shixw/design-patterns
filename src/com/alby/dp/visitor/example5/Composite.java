package com.alby.dp.visitor.example5;


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
    //通常在里面需要实现递归的调用

    @Override
    public void accept(Visitor visitor) {
        visitor.visitComposite(this);

        for (Component childComponent : childComponents) {
            childComponent.accept(visitor);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //组合对象的名称
    private String name="";

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        //延迟初始化
        if (childComponents == null){
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents!=null){
            childComponents.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if (childComponents != null){
            if (index>0){
                return childComponents.get(index);
            }
        }
        return null;
    }
}
