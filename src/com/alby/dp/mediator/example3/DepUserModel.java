package com.alby.dp.mediator.example3;

/**
 * Created by xianwei on 2015/12/3.
 * 部门和人员关系类
 */
public class DepUserModel {
    private String depUserId;
    private String depId;
    private String userId;

    public void setDepUserId(String depUserId) {
        this.depUserId = depUserId;
    }

    public String getDepUserId() {
        return depUserId;
    }


    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepId() {
        return depId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
