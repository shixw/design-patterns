package com.alby.dp.proxy.example3;

/**
 * Created by xianwei on 2015/12/4.
 * 定义用户数据的抽象接口
 */
public interface UserModelApi {
    public String getUserId();
    public void setUserId(String userId);
    public String getName();
    void setName(String name);
    String getDepId();
    void setDepId(String depId);
    String getSex();
    void setSex(String sex);
}

