package com.alby.dp.templatemethed.example6;



/**
 * Created by xianwei on 2015/12/9.
 * 登录控制的模板方法需要的回调接口
 * 需要尽可能的把所有需要的接口方法都定义出来
 * 或者说是所有可以被扩展的方法都需要被定义出来
 */
public interface LoginCallBack {

    //查找用户根据登录编号
    public LoginModel findLoginUser(String loginId);

    //加密密码
    public String encryptPwd(String pwd,LoginTemplate template);

    //判断用户填写的登录数据和存储中对应的数据是否匹配上
    public boolean match(LoginModel lm,LoginModel dblm,LoginTemplate template);
}
