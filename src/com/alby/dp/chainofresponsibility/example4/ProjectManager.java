package com.alby.dp.chainofresponsibility.example4;

/**
 * Created by xianwei on 2016/1/5.
 * 项目经理
 */
public class ProjectManager extends Handler {
    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";
        //项目经理权限比较小，只能500以内
        if (fee < 500) {
            if ("小李".equals(user)) {
                str = "项目经理同意 " + user + " 聚餐费用 " + fee + " 元的请求";
            } else {
                str = "项目经理不同意 " + user + " 聚餐费用 " + fee + " 元的请求";
            }
        } else {
            //超过500，继续传递给级别更高的人处理
            if (this.successor != null) {
                str = this.successor.handlerFeeRequest(user, fee);
            }
        }
        return str;
    }

    @Override
    public boolean handlePreFeeRequest(String user, double request) {
        if (request < 5000){
            System.out.println("项目经理同意 " + user + " 预支差旅费用 " + request + " 元的请求");
            return true;
        }else{
            if (this.successor != null) {
                return this.successor.handlePreFeeRequest(user, request);
            }
        }
        return false;
    }
}
