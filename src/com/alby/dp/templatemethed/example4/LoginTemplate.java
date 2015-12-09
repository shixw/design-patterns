package com.alby.dp.templatemethed.example4;

/**
 * Created by xianwei on 2015/12/9.
 * 登录控制的模板
 */
public abstract class LoginTemplate {

    /**
     * 判断登录数据是否正确，
     */
    public final boolean login(LoginModel loginModel){
        //1：查找登录人信息
        LoginModel dblm = this.findLoginUser(loginModel.getLoginId());

        if (dblm != null){
            //2：对密码进行加密
            String encryptPwd = this.encryptPwd(loginModel.getPwd());

            loginModel.setPwd(encryptPwd);


            //3：判读是否匹配
            return this.match(loginModel,dblm);
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
    public abstract LoginModel findLoginUser(String loginId);


}
