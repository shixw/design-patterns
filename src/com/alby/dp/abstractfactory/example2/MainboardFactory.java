package com.alby.dp.abstractfactory.example2;

/**
 * Created by xianwei on 2015/11/30.
 * 主板工厂
 */
public class MainboardFactory {
    public static MainboardApi createMainboardApi(int mainboardType) {
        MainboardApi mainboard = null;
        if (mainboardType == 1) {
            mainboard = new MSIMainboard(1156);
        } else if (mainboardType == 2) {
            mainboard = new GAMainboard(939);
        }
        return mainboard;
    }
}
