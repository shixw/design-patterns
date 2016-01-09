package com.alby.dp.visitor.example3;

/**
 * Created by xianwei on 2016/1/9.
 * 个人客户
 */
public class PersonalCustomer extends Customer {

    //联系电话
    private String telephone;
    //年龄
    private int age;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void serviceRequest() {
        System.out.println("客户 "+this.getName()+" 提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在对个人客户 "+this.getName()+" 进行产品偏好分析");

    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在对个人客户 "+this.getName()+" 进行价值分析");

    }
}
