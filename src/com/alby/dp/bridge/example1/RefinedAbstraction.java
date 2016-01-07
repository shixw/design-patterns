package com.alby.dp.bridge.example1;

/**
 * Created by xianwei on 2016/1/7.
 * 扩充有Abstraction定义的接口功能
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 示例操作，实现一定的功能，可能会使用具体的部分的实现方法
     * 但是本方法更大的可能是使用Abstraction中定义的方法
     * 通过组合使用Abstraction中定义的方法来完成更多的功能
     */
    public void otherOperation(){
        //
    }
}
