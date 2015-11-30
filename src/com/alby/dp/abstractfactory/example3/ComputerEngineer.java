package com.alby.dp.abstractfactory.example3;


/**
 * Created by xianwei on 2015/11/30.
 * 装机工程师类
 */
public class ComputerEngineer {
    /**
     * 定义组装机器需要的CPU
     */
    private CPUApi cpu = null;

    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboard = null;

    /**
     * 组装过程
     */
    public void makeComputer(AbstractFactory schema) {
        //1：首先准备好装机需要的配件
        prepareHardwares(schema);
        //2：组装机器
        //3：测试机器
        //4：交付客户
    }

    /**
     * 准备装机所需要的配件
     */
    private void prepareHardwares(AbstractFactory schema) {
        //这里要去准备CPU和主板的具体实现
        //

        //直接找相应的工厂获取
        this.cpu = schema.createCPUApi();
        this.mainboard = schema.createMainboardApi();

        //测试是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
