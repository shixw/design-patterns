package com.alby.dp.flyweight.example1;

/**
 * Created by xianwei on 2015/12/16.
 * 享元接口，通过这个接口享元可以接受并作用于外部状态
 */
public interface Flyweight {

    /**
     * 示例操作，传入外部状态
     * @param extrinsicState 外部状态
     */
    void operation(String extrinsicState);
}
