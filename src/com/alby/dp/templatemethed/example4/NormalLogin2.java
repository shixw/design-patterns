package com.alby.dp.templatemethed.example4;

/**
 * Created by xianwei on 2015/12/9.
 * 普通用户登录控制逻辑
 */
public class NormalLogin2 extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String loginId) {
        NormalLoginModel lm = new NormalLoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testpwd");
        lm.setQuestion("testQuestion");
        lm.setAnswer("testAnswer");
        return lm;
    }

    @Override
    public boolean match(LoginModel loginModel, LoginModel dblm) {
        //需要检测4个值是否正确，而不仅仅是缺省的2个
        boolean f1 = super.match(loginModel, dblm);
        if (f1){
            NormalLoginModel nlm = (NormalLoginModel) loginModel;
            NormalLoginModel dbNlm = (NormalLoginModel) dblm;

            if (dbNlm.getQuestion().equals(nlm.getQuestion())&&dbNlm.getAnswer().equals(nlm.getAnswer()))
                return true;
        }
        return false;
    }
}
