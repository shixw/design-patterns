package com.alby.dp.decorator.example3;

import java.util.Date;

/**
 * Created by xianwei on 2015/12/24.
 * 计算奖金的组件接口
 */
public abstract class Component {

    /**
     * 计算某人在某段时间内的奖金，有些参数在演示中并不会使用，
     * 但是在实际业务实现上是会用的，为了表示这是个具体的业务方法，
     * 因此这些参数被保留了
     *
     */
    abstract double calcPrize(String user,Date begin,Date end);
}
