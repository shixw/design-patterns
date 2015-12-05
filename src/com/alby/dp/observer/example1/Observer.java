package com.alby.dp.observer.example1;

/**
 * Created by xianwei on 2015/12/5.
 * 观察者接口，定义个更新的接口给那些在目标发送改变的时候被通知的对象
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入目标对象，好获取相应的目标对象的状态
     */
    void update(Subject subject);
}
