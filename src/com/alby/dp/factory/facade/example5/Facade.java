package com.alby.dp.factory.facade.example5;

/**
 * Created by xianwei on 2015/11/27.
 * 外观对象
 */
public class Facade implements FacadeApi{

    @Override
    public void generate() {
        new Presentation().generate();
        new Business().generate();
        new Dao().generate();
    }
}
