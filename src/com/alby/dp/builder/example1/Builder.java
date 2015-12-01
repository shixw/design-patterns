package com.alby.dp.builder.example1;

/**
 * Created by xianwei on 2015/12/1.
 * 构建器接口，定义创建一个产品对象所需要的各个部件的操作
 */
public interface Builder {
    /**
     * 构建某个部件
     */
    public void buildPart();
}
