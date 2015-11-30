package com.alby.dp.abstractfactory.example4;

/**
 * Created by xianwei on 2015/11/30.
 *
 */
public class HyMemory implements MemoryApi{
    @Override
    public void cacheData() {
        System.out.println("现在正在使用现代内存");
    }
}
