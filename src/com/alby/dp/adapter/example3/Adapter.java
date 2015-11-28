package com.alby.dp.adapter.example3;

import java.util.List;

/**
 * Created by xianwei on 2015/11/28.
 * 适配器对象，把记录日志到文件的功能适配成第二版需要的增删改查的功能
 */
public class Adapter implements LogDbOperateApi {

    /**
     * 持有需要被适配的接口对象
     */
    private LogFileOperateApi adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     *
     * @param adaptee 需要被适配的对象
     */
    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel logModel) {
        //读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //加入新的日志对象
        list.add(logModel);
        //重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        //读取文件内容
        List<LogModel> list = adaptee.readLogFile();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }

        //重新写入
        adaptee.writeLogFile(list);

    }

    @Override
    public void removeLog(LogModel logModel) {
        //读取文件内容
        List<LogModel> list = adaptee.readLogFile();
        //删除相应的日志对象
        list.remove(logModel);
        //重新写入
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAlllog() {
        return adaptee.readLogFile();
    }
}
