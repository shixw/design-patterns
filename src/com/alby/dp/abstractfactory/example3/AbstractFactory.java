package com.alby.dp.abstractfactory.example3;

/**
 * Created by xianwei on 2015/11/30.
 * 抽象工厂
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return  CPU对象
     */
    public  CPUApi createCPUApi();

    public MainboardApi createMainboardApi();
}
