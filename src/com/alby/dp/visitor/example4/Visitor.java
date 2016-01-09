package com.alby.dp.visitor.example4;

/**
 * Created by xianwei on 2016/1/9.
 * 访问者接口
 */
public interface Visitor {
    //访问企业客户，相当于给企业客户添加访问者的功能
    void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer);

    //访问个人客户，相当于给个人客户添加访问者的功能
    void visitPersonalCustomer(PersonalCustomer personalCustomer);
}
