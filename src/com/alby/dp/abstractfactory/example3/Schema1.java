package com.alby.dp.abstractfactory.example3;

/**
 * Created by xianwei on 2015/11/30.
 * 装机方案一
 */
public class Schema1 implements  AbstractFactory{
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
