package com.alby.dp.visitor.example3;

/**
 * Created by xianwei on 2016/1/9.
 * 企业客户
 */
public class EnterpriseCustomer extends Customer {
//联系人
    private String linkman;
//联系电话
    private String linkTelephone;
//注册地址
    private String registerAddress;

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }


    @Override
    public void serviceRequest() {
        System.out.println(this.getName()+" 企业提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在对企业客户 "+this.getName()+" 进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在对企业客户 "+this.getName()+" 进行价值分析");

    }
}
