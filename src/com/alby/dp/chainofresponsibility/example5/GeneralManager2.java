package com.alby.dp.chainofresponsibility.example5;

public class GeneralManager2 extends GeneralManager {
    @Override
    public Object handleRequest(RequestModel rm) {
        if (PreFeeRequestModel.FEE_TYPE.equals(rm.getType())) {
            return myHandler(rm);
        } else {
            return super.handleRequest(rm);
        }
    }

    public Object myHandler(RequestModel rm) {
        PreFeeRequestModel pfrm = (PreFeeRequestModel) rm;
        //总经理权限比较小，只有请求到了这里，他都可以处理
        if (pfrm.getFee() >= 500) {
            System.out.println("总经理同意 " + pfrm.getUser() + " 预支差旅费用 " + pfrm.getFee() + " 元的请求");
            return true;
        } else {
            if (this.successor != null) {
                return this.successor.handleRequest(rm);
            }
        }
        return false;
    }
}
