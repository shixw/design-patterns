package com.alby.dp.templatemethed.example3;

/**
 * Created by xianwei on 2015/12/9.
 * 工作人员登录控制的逻辑处理
 */
public class WorkerLogin {
    /**
     * 判断登录数据是否正确，也就是是否能登录成功
     *
     * @param loginModel 封装登录数据的Model
     * @return true表示登录成功   false表示登录失败
     */
    public boolean login(LoginModel loginModel) {
        //1：从数据库中获取人员的信息，
        UserModel um = this.findUserByUserId(loginModel.getWorkerId());


        if (um != null) {
            if (um.getWorkerId().equals(loginModel.getWorkerId()) && um.getPwd().equals(loginModel.getPwd()))
                return true;
        }
        return false;
    }

    private UserModel findUserByUserId(String workerId) {
        UserModel um = new UserModel();
        um.setWorkerId(workerId);
        um.setName("Test");
        um.setPwd("test");
        um.setUuid("Test0001");
        return um;
    }
}
