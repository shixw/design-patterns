package com.alby.dp.chainofresponsibility.example3;

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
}
