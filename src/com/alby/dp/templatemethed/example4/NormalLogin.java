package com.alby.dp.templatemethed.example4;

/**
 * Created by xianwei on 2015/12/9.
 * 普通用户登录控制逻辑
 */
public class NormalLogin extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testpwd");
        return lm;
    }
}
