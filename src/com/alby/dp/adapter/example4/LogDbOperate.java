package com.alby.dp.adapter.example4;


import java.util.List;

/**
 * Created by xianwei on 2015/11/28.
 * BD存储的实现，
 */
public class LogDbOperate implements LogDbOperateApi{
    public void createLog(LogModel logModel){
        System.out.println("db createLog = [" + logModel + "]");
    }
    public void updateLog(LogModel logModel){
        System.out.println("db updateLog = [" + logModel + "]");
    }
    public void removeLog(LogModel logModel){
        System.out.println("db removeLog = [" + logModel + "]");
    }
    public List<LogModel> getAlllog(){
        System.out.println("db getAlllog ");
        return null;
    }
}
