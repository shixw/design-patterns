package com.alby.dp.templatemethed.example6;

public class Client {
    public static void main(String[] args) {
        LoginModel lm = new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd("workerpwd");

        LoginTemplate lt = new LoginTemplate();

        boolean flag2 = lt.login(lm, new LoginCallBack() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                LoginModel lm = new LoginModel();
                lm.setLoginId(loginId);
                lm.setPwd("testpwd");
                return lm;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dblm, LoginTemplate template) {
                return template.match(lm,dblm);
            }

        });
        System.out.println(flag2);

        ///测试工作人员
        //.........
    }
}
