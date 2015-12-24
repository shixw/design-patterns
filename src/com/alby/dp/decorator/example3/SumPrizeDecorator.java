package com.alby.dp.decorator.example3;

import java.util.Date;

/**
 * Created by xianwei on 2015/12/24.
 * 装饰器对象，计算累计奖金
 */
public class SumPrizeDecorator extends Decorator {
    public SumPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    double calcPrize(String user, Date begin, Date end) {
        double money =  super.calcPrize(user, begin, end);

        //累计奖
        double prize = 1000000 * 0.001;

        System.out.println(user + " 当月业务奖金 " + prize);

        return money + prize;
    }
}
