package com.alby.dp.proxy.example3;

import java.util.Collection;

public class Client  {
    public static void main(String[] args) throws Exception {
        UserManager userManager = new UserManager();
        Collection<UserModelApi> col = userManager.getUserByDepId("0101");

        //如果只是显示用户名，那么就需要重新查询数据库
        for (UserModelApi um :col){
            System.out.println(um.getName());
        }

        //如果要访问非用户编号和用户姓名的属性，就重新访问数据库
        for (UserModelApi um :col){
            System.out.println(um.getName());
            System.out.println(um.getSex());
        }
    }
}
