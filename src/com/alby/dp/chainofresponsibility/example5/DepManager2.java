package com.alby.dp.chainofresponsibility.example5;

/**
 * Created by xianwei on 2016/1/5.
 * 部门经理
 */
public class DepManager2 extends DepManager {
    @Override
    public Object handleRequest(RequestModel rm) {
        if (PreFeeRequestModel.FEE_TYPE.equals(rm.getType())){
            return myHandler(rm);
        }else{
            return super.handleRequest(rm);
        }
    }
    public Object myHandler(RequestModel rm) {
        PreFeeRequestModel pfrm = (PreFeeRequestModel) rm;
        if (pfrm.getFee() < 20000) {
            System.out.println("部门经理同意 " + pfrm.getUser() + " 预支差旅费用 " + pfrm.getFee() + " 元的请求");
            return true;
        } else {
            //超过500，继续传递给级别更高的人处理
            if (this.successor != null) {
                return this.successor.handleRequest(rm);
            }
        }
        return false;
    }
}
