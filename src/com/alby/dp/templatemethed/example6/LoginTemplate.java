package com.alby.dp.templatemethed.example6;


/**
 * Created by xianwei on 2015/12/9.
 * 登录控制的模板
 */
public class LoginTemplate {

    /**
     * 判断登录数据是否正确，
     */
    public final boolean login(LoginModel loginModel,LoginCallBack callBack){
        //1：查找登录人信息
        LoginModel dblm = callBack.findLoginUser(loginModel.getLoginId());

        if (dblm != null){
            //2：对密码进行加密
            String encryptPwd = callBack.encryptPwd(loginModel.getPwd(), this);

            loginModel.setPwd(encryptPwd);


            //3：判读是否匹配
            return callBack.match(loginModel,dblm,this);
        }

        return false;
    }

    //钩子方法
    public boolean match(LoginModel loginModel, LoginModel dblm) {
        return loginModel.getLoginId().equals(dblm.getLoginId()) && loginModel.getPwd().equals(dblm.getPwd());
    }

    //提供模式的加密方法，不加密
    public String encryptPwd(String pwd){
        return pwd;
    }

    //抽象方法  原因操作
    public LoginModel findLoginUser(String loginId){
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testpwd");
        return lm;
    }


}
