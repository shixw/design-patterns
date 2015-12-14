package com.alby.dp.state.example6;

/**
 * Created by xianwei on 2015/12/14.
 * 公共状态接口
 */
public interface State {
    //执行状态对象的功能处理
    void doWork(StateMachine request);
}
