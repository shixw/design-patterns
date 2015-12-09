package com.alby.dp.templatemethed.example3;

/**
 * Created by xianwei on 2015/12/9.
 * 描述登录人员登录时填写的信息和数据模型
 */
public class LoginModel {
    private String workerId,pwd;

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
