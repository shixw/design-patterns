package com.alby.dp.decorator.example1;

/**
 * Created by xianwei on 2015/12/24.
 * 装饰器接口，维持一个指向组件对象的接口对象
 * 并定义一个与组件接口一致的接口
 */
public abstract class Decorator extends Component {

    //持有组件对象
    protected Component component;

    //构造方法，传入组件对象
    public Decorator(Component component) {
        this.component = component;
    }

    //缺省实现   基本不实现装饰
    @Override
    void operation() {

        //转发请求给组件对象，可以在转发前后执行一些附加动作
        component.operation();
    }
}
