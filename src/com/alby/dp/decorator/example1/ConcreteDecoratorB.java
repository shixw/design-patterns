package com.alby.dp.decorator.example1;

/**
 * Created by xianwei on 2015/12/24.
 * 装饰器的具体实现对象，想组件对象添加职责
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }


    //需要添加的职责
    private void addedBehavior(){
        //需要添加的职责实现
    }

    @Override
    void operation() {
        //调用父类的方法，可以在调用前后执行一些附件动作
        //在这里进行处理的时候，可以使用添加的状态
        component.operation();
        addedBehavior();
    }
}
