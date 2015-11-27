package com.alby.dp.factory.facade.example5;

/**
 * Created by xianwei on 2015/11/27.
 * Facade工厂类
 */
public class FacadeFactory {
    private FacadeFactory(){

    }

    public static FacadeApi createFacadeApi(){
        return new Facade();
    }
}
