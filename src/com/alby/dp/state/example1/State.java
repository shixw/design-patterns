package com.alby.dp.state.example1;

/**
 * Created by xianwei on 2015/12/11.
 * 封装与Context的一个特定状态相关的行为
 */
public interface State {

    /**
     * 状态对应的处理
     * @param sampleParameter 参数，说明可以传入参数，具体传入什么样的参数，
     *                         传入几个参数，由具体应用来具体分析
     */
    public void handle(String sampleParameter);
}
