package com.alby.dp.chainofresponsibility.example5;

public class GeneralManager extends Handler {
    @Override
    public Object handleRequest(RequestModel rm) {
        if (FeeRequestModel.FEE_TYPE.equals(rm.getType())) {
            return handlerFeeRequest(rm);
        } else {
            return super.handleRequest(rm);
        }
    }

    public Object handlerFeeRequest(RequestModel rm) {
        FeeRequestModel frm = (FeeRequestModel) rm;
        String str = "";
        //总经理权限比较小，只有请求到了这里，他都可以处理
        if (frm.getFee() >= 1000) {
            if ("小李".equals(frm.getUser())) {
                str = "总经理同意 " + frm.getUser() + " 聚餐费用 " + frm.getFee() + " 元的请求";
            } else {
                str = "总经理不同意 " + frm.getUser() + " 聚餐费用 " + frm.getFee() + " 元的请求";
            }
        } else {
            //超过500，继续传递给级别更高的人处理
            if (this.successor != null) {
                return this.successor.handleRequest(rm);
            }
        }
        return str;
    }
}
