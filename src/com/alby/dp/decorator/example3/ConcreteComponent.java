package com.alby.dp.decorator.example3;

import java.util.Date;

/**
 * Created by xianwei on 2015/12/24.
 * 基本的实现计算奖金的类，也是被装饰器装饰的对象
 */
public class ConcreteComponent extends Component {
    @Override
    double calcPrize(String user, Date begin, Date end) {
        //只是一个默认的实现，默认没有奖金
        return 0;
    }
}
