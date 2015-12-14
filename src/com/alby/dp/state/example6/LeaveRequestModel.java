package com.alby.dp.state.example6;

/**
 * Created by xianwei on 2015/12/14.
 * 请假单对象
 */
public class LeaveRequestModel {

    private String user;

    private String beginDate;

    private int leaveDays;

    private String result;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
