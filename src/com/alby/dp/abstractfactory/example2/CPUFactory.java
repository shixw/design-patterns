package com.alby.dp.abstractfactory.example2;

/**
 * Created by xianwei on 2015/11/30.
 * CPU工厂
 */
public class CPUFactory {
    public static CPUApi createCPUApi(int cpuType) {
        CPUApi cpu = null;
        if (cpuType == 1) {
            cpu = new IntelCPU(1156);
        } else if (cpuType == 2) {
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
