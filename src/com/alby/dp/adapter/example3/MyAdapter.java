package com.alby.dp.adapter.example3;

import java.util.List;

/**
 * Created by xianwei on 2015/11/28.
 * 自己定义Adapter时可以只定义部分实现，
 */
public class MyAdapter extends DefaultAdapter{
    /**
     * 持有需要被适配的接口对象
     */
    private LogFileOperateApi adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     *
     * @param adaptee 需要被适配的对象
     */
    public MyAdapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
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
