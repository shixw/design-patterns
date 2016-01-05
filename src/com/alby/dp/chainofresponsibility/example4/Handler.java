package com.alby.dp.chainofresponsibility.example4;

/**
 * Created by xianwei on 2016/1/5.
 * 职责的接口，也就是处理请求的接口
 */
public abstract class Handler {

    /**
     * 持有后续的职责对象
     */
    protected Handler successor;

    /**
     * 设置后续的职责对象
     * @param successor 后续的职责对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的方法，虽然这个示意方法没有传入参数，但是
     * 实际是可以传入参数的，根据具体需要来选择是否传入参数
     */
    public abstract String handlerFeeRequest(String user,double fee);

    /**
     * 处理预支差旅费用的申请
     * @param user 申请人
     * @param request 申请的金额
     * @return 成功或失败的具体通知
     */
    public abstract boolean handlePreFeeRequest(String user,double request);
}
