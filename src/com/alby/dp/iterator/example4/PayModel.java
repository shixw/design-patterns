package com.alby.dp.iterator.example4;

/**
 * Created by xianwei on 2015/12/7.
 * 工资描述模型对象
 */
public class PayModel {
    //人员
    private String userName;

    //工资数额
    private double pay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "userName="+userName+",pay="+pay;
    }
}
