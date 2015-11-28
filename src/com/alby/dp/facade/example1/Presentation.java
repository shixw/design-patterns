package com.alby.dp.facade.example1;

/**
 * Created by xianwei on 2015/11/27.
 * 生成表现层模块
 */
public class Presentation {
    public void generate() {
        //从管理配置里面获取相应的配置文件
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenPresentation()) {
            //按照要求去生成相应的代码，并保存成文件
            System.out.println("正在生成表现层代码文件");
        }
    }
}
