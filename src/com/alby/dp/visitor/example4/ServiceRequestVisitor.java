package com.alby.dp.visitor.example4;

/**
 * Created by xianwei on 2016/1/9.
 * 具体的访问者，实现客户提出的请求的功能
 */
public class ServiceRequestVisitor implements Visitor {
    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        System.out.println(enterpriseCustomer.getName()+" 企业提出服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        System.out.println("客户 "+personalCustomer.getName()+" 提出服务请求");
    }
}
