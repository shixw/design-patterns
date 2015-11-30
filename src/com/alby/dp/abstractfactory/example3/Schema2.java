package com.alby.dp.abstractfactory.example3;

/**
 * Created by xianwei on 2015/11/30.
 * 装机方案二
 */
public class Schema2 implements AbstractFactory{
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard(939);
    }
}
