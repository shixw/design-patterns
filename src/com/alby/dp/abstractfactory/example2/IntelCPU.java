package com.alby.dp.abstractfactory.example2;

/**
 * Created by xianwei on 2015/11/30.
 * Intel的CPU实现
 */
public class IntelCPU implements CPUApi {

    /**
     * CPU的针脚数目
     */
    private int pins = 0;

    /**
     * 构造方法，传入CPU的针脚数目
     * @param pins  CPU的针脚数目
     */
    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now is Intel CPU,pins="+pins);
    }
}
