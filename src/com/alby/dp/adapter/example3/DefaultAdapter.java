package com.alby.dp.adapter.example3;

import java.util.List;

/**
 * Created by xianwei on 2015/11/28.
 * 默认适配器
 */
public class DefaultAdapter  implements LogDbOperateApi{
    @Override
    public void createLog(LogModel logModel) {
        System.out.println("createLog");
    }

    @Override
    public void updateLog(LogModel logModel) {
        System.out.println("updateLog");
    }

    @Override
    public void removeLog(LogModel logModel) {

    }

    @Override
    public List<LogModel> getAlllog() {
        return null;
    }
}
