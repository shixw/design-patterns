package com.alby.dp.templatemethed.example7;

/**
 * Created by xianwei on 2015/12/9.
 * 用户数据模型
 */
public class UserModel {
    private String userId,name;
    private int age;

    public UserModel(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "userId = "+userId+",name="+name+",age="+age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
