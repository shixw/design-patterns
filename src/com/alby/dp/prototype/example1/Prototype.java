package com.alby.dp.prototype.example1;

/**
 * Created by xianwei on 2015/12/2.
 * 声明一个克隆自身的接口
 */
public interface Prototype {
    /**
     * 克隆自身的方法
     * @return  一个 自身克隆出来的对象
     */
    public Prototype clone();
}
