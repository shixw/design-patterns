package com.alby.dp.proxy.example2;

/**
 * Created by xianwei on 2015/12/4.
 * 描述用户数据的对象
 */
public class UserModel {
    private String userId;
    private String name;
    private String depId;
    private String sex;

    @Override
    public String toString() {
        return "userid=" + userId + ",name=" + name + ",depid=" + depId + ",sex=" + sex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
