package com.alby.dp.facade.example3;

/**
 * Created by xianwei on 2015/11/27.
 * 代码生成子系统大外观对象
 * 包装、组合已有的功能
 */
public class Facade {
    /**
     * 客户端需要的，一个简单的调用代码生成的功能
     *
     */
    public void generate(){
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }
}
