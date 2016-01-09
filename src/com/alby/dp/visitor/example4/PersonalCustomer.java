package com.alby.dp.visitor.example4;

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
    public void accept(Visitor visitor) {
        visitor.visitPersonalCustomer(this);
    }
}
