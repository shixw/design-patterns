package com.alby.dp.factory.facade.example3;

/**
 * Created by xianwei on 2015/11/27.
 * 生成数据层的模块
 */
public class Dao {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenDao()){
            System.out.println("正在生成数据层代码");
        }
    }
}
