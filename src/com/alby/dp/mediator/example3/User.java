package com.alby.dp.mediator.example3;

/**
 * Created by xianwei on 2015/12/3..
 * 人员
 */
public class User {
    private String userId;
    private String userName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean dimission(){
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteUser(this.userId);

        return true;
    }
}
