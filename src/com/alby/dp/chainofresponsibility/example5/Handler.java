package com.alby.dp.chainofresponsibility.example5;

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
     * 通用的请求处理方法
     * @param rm 通用的请求对象
     * @return 处理后需要返回的对象
     */
    public Object handleRequest(RequestModel rm){
        if (successor != null){
            return this.successor.handleRequest(rm);
        }else {
            System.out.println("没有后续处理或者暂时不支持这样的功能处理");
            return false;
        }
    }


}
