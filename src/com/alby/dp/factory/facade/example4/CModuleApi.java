package com.alby.dp.factory.facade.example4;

/**
 * Created by xianwei on 2015/11/27.
 *
 */
public interface CModuleApi {
    //提供给子系统外部使用
    public void c1();

    //提供给同一个子系统中，不同的模块使用
    public void c2();
    public void c3();
}
