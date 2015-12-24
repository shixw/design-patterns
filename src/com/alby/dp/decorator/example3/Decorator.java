package com.alby.dp.decorator.example3;

import java.util.Date;

/**
 * Created by xianwei on 2015/12/24.
 * 装饰器的接口，需要跟被装饰的对象实现相同的接口
 */
public abstract class Decorator extends Component {

    //持有被装饰的组件对象
    protected Component c;

    public Decorator(Component c) {
        this.c = c;
    }

    @Override
    double calcPrize(String user, Date begin, Date end) {
        //转调组件对象的方法
        return c.calcPrize(user,begin,end);
    }
}
