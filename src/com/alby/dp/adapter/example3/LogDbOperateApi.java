package com.alby.dp.adapter.example3;

import java.util.List;

/**
 * Created by xianwei on 2015/11/28.
 * 定义操作日志的应用接口，数据库
 */
public interface LogDbOperateApi {
    public void createLog(LogModel logModel);
    public void updateLog(LogModel logModel);
    public void removeLog(LogModel logModel);
    public List<LogModel> getAlllog();
}
