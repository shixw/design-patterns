package com.alby.dp.chainofresponsibility.example5;

/**
 * Created by xianwei on 2016/1/5.
 * 项目经理
 */
public class ProjectManager extends Handler {
    @Override
    public Object handleRequest(RequestModel rm) {
        if (FeeRequestModel.FEE_TYPE.equals(rm.getType())){
            return handlerFeeRequest(rm);
        }else{
            return super.handleRequest(rm);
        }
    }

    public Object handlerFeeRequest(RequestModel rm) {
        FeeRequestModel frm = (FeeRequestModel) rm;
        String str = "";
        //项目经理权限比较小，只能500以内
        if (frm.getFee() < 500) {
            if ("小李".equals(frm.getUser())) {
                str = "项目经理同意 " + frm.getUser() + " 聚餐费用 " + frm.getFee() + " 元的请求";
            } else {
                str = "项目经理不同意 " + frm.getUser() + " 聚餐费用 " + frm.getFee() + " 元的请求";
            }
            return str;
        } else {
            //超过500，继续传递给级别更高的人处理
            if (this.successor != null) {
                return this.successor.handleRequest(rm);
            }
        }
        return str;
    }

}
