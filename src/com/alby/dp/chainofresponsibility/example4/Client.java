package com.alby.dp.chainofresponsibility.example4;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试
        String ret1 = h3.handlerFeeRequest("小李", 300);
        System.out.println("the ret1="+ret1);
        String ret2 = h3.handlerFeeRequest("小张", 300);
        System.out.println("the ret2="+ret2);

        String ret3 = h3.handlerFeeRequest("小李", 600);
        System.out.println("the ret3="+ret3);
        String ret4 = h3.handlerFeeRequest("小张", 600);
        System.out.println("the ret4="+ret4);

        String ret5 = h3.handlerFeeRequest("小李", 1200);
        System.out.println("the ret5="+ret5);
        String ret6 = h3.handlerFeeRequest("小张", 1200);
        System.out.println("the ret6="+ret6);

        //开始申请差旅费的费用

        h3.handlePreFeeRequest("小张",3000);
        h3.handlePreFeeRequest("小张",6000);
        h3.handlePreFeeRequest("小张",32000);
    }
}
