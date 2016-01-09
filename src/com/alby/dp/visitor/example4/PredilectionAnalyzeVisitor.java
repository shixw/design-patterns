package com.alby.dp.visitor.example4;

/**
 * Created by xianwei on 2016/1/9.
 * 具体的访问者，实现客户提出的请求的功能
 */
public class PredilectionAnalyzeVisitor implements Visitor {
    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        System.out.println("现在对企业客户 "+enterpriseCustomer.getName()+" 进行产品偏好分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        System.out.println("现在对个人客户 "+personalCustomer.getName()+" 进行产品偏好分析");
    }
}
