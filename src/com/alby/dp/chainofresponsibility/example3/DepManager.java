package com.alby.dp.chainofresponsibility.example3;

/**
 * Created by xianwei on 2016/1/5.
 * 部门经理
 */
public class DepManager extends Handler {
    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";
        //部门经理权限比较小，只能1000以内
        if (fee < 1000) {
            if ("小李".equals(user)) {
                str = "部门经理同意 " + user + " 聚餐费用 " + fee + " 元的请求";
            } else {
                str = "部门经理不同意 " + user + " 聚餐费用 " + fee + " 元的请求";
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
