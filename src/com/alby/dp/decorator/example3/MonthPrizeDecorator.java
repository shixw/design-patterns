package com.alby.dp.decorator.example3;

import java.util.Date;

/**
 * Created by xianwei on 2015/12/24.
 * 装饰器对象，计算当月业务奖金
 */
public class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    double calcPrize(String user, Date begin, Date end) {
        //先获取前面计算出来的奖金
        double money = super.calcPrize(user, begin, end);

        //然后计算当月业务奖金，按照人员和时间去获取当月的业务额，单后在....
        double prize = TempDB.mapMonthSaleMoney.get(user)*0.03;
        System.out.println(user + " 当月业务奖金 " + prize);
        return money + prize;
    }
}
