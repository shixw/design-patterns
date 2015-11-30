package com.alby.dp.abstractfactory.example3;


/**
 * Created by xianwei on 2015/11/30.
 * AMD的CPU实现
 */
public class AMDCPU implements CPUApi {
    /**
     * CPU的针脚数目
     */
    private int pins = 0;

    /**
     * 构造方法，传入CPU的针脚数目
     * @param pins  CPU的针脚数目
     */
    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now is AMP CPU,pins="+pins);
    }
}
