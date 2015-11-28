package com.alby.dp.adapter.example4;


import java.util.List;

/**
 * Created by xianwei on 2015/11/28.
 * 日志文件操作接口
 */
public interface LogFileOperateApi {

    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     * @return  存储的日志列表对象
     */
    public List<LogModel> readLogFile();

    /**
     * 写日志文件，把日志列表写出到日志文件中
     * @param list  要写到日志文件的日志列表
     */
    public void writeLogFile(List<LogModel> list);
}
