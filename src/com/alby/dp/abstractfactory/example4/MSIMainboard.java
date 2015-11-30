package com.alby.dp.abstractfactory.example4;

/**
 * Created by xianwei on 2015/11/30.
 * 微星的主板
 */
public class MSIMainboard implements MainboardApi {
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles  CPU插槽的孔数
     */
    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now is MSIMainboard,cpuHoled="+cpuHoles);
    }
}
