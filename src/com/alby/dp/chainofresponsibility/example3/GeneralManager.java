package com.alby.dp.chainofresponsibility.example3;

public class GeneralManager extends Handler {
    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";
        //总经理权限比较小，只有请求到了这里，他都可以处理
        if (fee >= 1000) {
            if ("小李".equals(user)) {
                str = "总经理同意 " + user + " 聚餐费用 " + fee + " 元的请求";
            } else {
                str = "总经理不同意 " + user + " 聚餐费用 " + fee + " 元的请求";
            }
        } else {
            //超过500，继续传递给级别更高的人处理
            if (this.successor != null) {
                str = this.successor.handlerFeeRequest(user, fee);
            }
        }
        return str;
    }
}
