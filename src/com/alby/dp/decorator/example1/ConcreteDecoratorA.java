package com.alby.dp.decorator.example1;

/**
 * Created by xianwei on 2015/12/24.
 * 装饰器的具体实现对象，想组件对象添加职责
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }


    private String addedState;

    public String getAddedState() {
        return addedState;
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }

    @Override
    void operation() {
        //调用父类的方法，可以在调用前后执行一些附件动作
        //在这里进行处理的时候，可以使用添加的状态
        System.out.println("begin------------------");
        component.operation();
        System.out.println("end--------------------");
    }
}
