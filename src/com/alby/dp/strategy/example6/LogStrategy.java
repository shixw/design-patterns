package com.alby.dp.strategy.example6;

/**
 * Created by xianwei on 2015/12/10.
 * 日志记录策略接口
 */
public interface LogStrategy {

    /**
     * 记录日志
     */
    public void log(String msg);
}
