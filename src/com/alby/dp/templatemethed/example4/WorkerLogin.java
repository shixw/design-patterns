package com.alby.dp.templatemethed.example4;

/**
 * Created by xianwei on 2015/12/9.
 * 工作人员登录控制的逻辑处理
 */
public class WorkerLogin extends LoginTemplate{
    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("workerpwd");
        return lm;
    }

    @Override
    public String encryptPwd(String pwd) {
        //覆盖父类的方法，提供真正的加密实现
        //这里对密码进行加密，比如使用：MD5，，，，，
        System.out.println("使用MD5进行密码加密");
        return pwd;
    }
}
