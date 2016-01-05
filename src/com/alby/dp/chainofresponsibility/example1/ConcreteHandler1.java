package com.alby.dp.chainofresponsibility.example1;

/**
 * Created by xianwei on 2016/1/5.
 * 具体的职责对象，用来处理请求
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handlerRequest() {

        /**
         * 根据某些条件判断是否属于自己处理的职责范围
         * 判断条件比如：从外部传入的参数，或者这里主动去获取的外部数据
         * 如从数据库中获取等，以下只为示意
         */
        boolean someCondition = false;
        if (someCondition){
            //如果属于自己处理的职责范围，就在这里处理
            //具体处理的代码
            System.out.println("ConcreteHandler1 handle request");
        }else {
            //如果不属于自己处理的职责范围，那就判断是否还有后续的职责对象，如果有就转发
            if (this.successor!=null){
                successor.handlerRequest();
            }
        }
    }
}
