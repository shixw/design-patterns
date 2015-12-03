package com.alby.dp.mediator.example3;

/**
 * Created by xianwei on 2015/12/3.
 * 部门
 */
public class Dep {
    private String depId;
    private String depName;


    public void setDepId(String depId) {
        this.depId = depId;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepId() {
        return depId;
    }

    public String getDepName() {
        return depName;
    }

    public boolean deleteDep(){
        //先通知中介者去清除所有与这个部门相关的部门和人员
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();

        mediator.deleteDep(this.depId);

        //然后才能真正的清除掉这个部门
        return true;
    }
}
