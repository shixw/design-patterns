package com.alby.dp.chainofresponsibility.example5;

/**
 * Created by xianwei on 2016/1/5.
 * 封装跟差旅费用申请业务相关的请求数据
 */
public class PreFeeRequestModel extends RequestModel{
    public final static String FEE_TYPE = "preFee";
    public PreFeeRequestModel() {
        super(FEE_TYPE);
    }

    //申请人
    private String user;

    //申请金额
    private double fee;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
