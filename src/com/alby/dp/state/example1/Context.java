package com.alby.dp.state.example1;

/**
 * Created by xianwei on 2015/12/11.
 * 定义客户感兴趣的接口，通常会维护一个State类型的对象实例
 */
public class Context {

    //持有一个State类型的对象实例
    private State state;

    //设置实现State的对象实例

    public void setState(State state) {
        this.state = state;
    }

    //用户感兴趣的接口方法
    public void request(String sampleParameter){
        state.handle(sampleParameter);
    }
}
