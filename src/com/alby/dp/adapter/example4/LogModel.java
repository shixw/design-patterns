package com.alby.dp.adapter.example4;

import java.io.Serializable;

/**
 * Created by xianwei on 2015/11/28.
 * 日志数据对象
 */
public class LogModel implements Serializable{
    /**
     * 日志编号
     */
    private String logId;
    /**
     * 操作人员
     */
    private String operateUser;
    /**
     * 操作时间，以 yyyy-MM-dd HH:mm:ss格式记录
     */
    private String operateTime;
    /**
     * 日志内容
     */
    private String logContent;

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }
}
