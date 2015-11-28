package com.alby.dp.adapter.example4;

import java.util.List;

/**
 * Created by xianwei on 2015/11/29.
 * 双向适配器
 */
public class TwoDirectAdapter implements LogDbOperateApi,LogFileOperateApi {

    /**
     * 持有需要被适配的文件存储日志的接口对象
     */
    private LogFileOperateApi fileLog;
    /**
     * 持有需要被适配的BD存储日志的接口对象
     */
    private LogDbOperateApi dbLog;

    /**
     * 构造方法，传入需要被适配的对象
     * @param dbLog  需要被适配的BD存储日志的接口对象
     * @param fileLog 需要被适配的文件存储日志的接口对象
     */
    public TwoDirectAdapter(LogDbOperateApi dbLog, LogFileOperateApi fileLog) {
        this.dbLog = dbLog;
        this.fileLog = fileLog;
    }
/** 将文件操作的方式适配成DB操作的方式 **/
    @Override
    public void createLog(LogModel logModel) {
        //读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        //加入新的日志对象
        list.add(logModel);
        //重新写入文件
        fileLog.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        //读取文件内容
        List<LogModel> list = fileLog.readLogFile();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }

        //重新写入
        fileLog.writeLogFile(list);

    }

    @Override
    public void removeLog(LogModel logModel) {
        //读取文件内容
        List<LogModel> list = fileLog.readLogFile();
        //删除相应的日志对象
        list.remove(logModel);
        //重新写入
        fileLog.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAlllog() {
        return fileLog.readLogFile();
    }


 /** 将DB操作的方式适配成文件操作的方式 **/

    @Override
    public List<LogModel> readLogFile() {
        return dbLog.getAlllog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {

        for (LogModel logModel:list){
            dbLog.createLog(logModel);
        }
    }
}
