package com.alby.dp.flyweight.example2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/16.
 * 安全管理，实现成单例
 */
public class SecurityMgr {

    private static SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr() {
    }

    public static SecurityMgr getInstance(){
        return securityMgr;
    }

    /**
     * 在运行期间，用来存放登录人员对应的权限
     * 在web应用中，这些数据通常会存放到session中
     */
    private Map<String,Collection<AuthorizationModel>> map = new HashMap<String, Collection<AuthorizationModel>>();

    //模拟登录
    public void login(String user){
        //登录的时候需要把该用户所拥有的权限，从数据库中取出来，放到缓存中去
        Collection<AuthorizationModel> col = queryByUser(user);
        map.put(user,col);
    }

    public boolean hasPermit(String user,String securityEntity,String permit){
        Collection<AuthorizationModel> col = map.get(user);
        if (col==null || col.size()==0){
            System.out.println(user+" 没有登录或是没有被分配任何权限");
            return false;
        }
        for (AuthorizationModel model : col) {
            //输出当前实例，看看是否为同一个实例对象
            System.out.println("am=="+model);
            if (model.getSecurityEntity().endsWith(securityEntity)&&model.getPermit().equals(permit)){
                return true;
            }
        }
        return false;

    }
    //从数据库中获取某人所拥有的权限
    private Collection<AuthorizationModel> queryByUser(String user) {
        Collection<AuthorizationModel> col = new ArrayList<AuthorizationModel>();

        for (String s : TestDB.colDB) {
            String[] ss = s.split(",");
            if (ss[0].equals(user)){
                AuthorizationModel em = new AuthorizationModel();
                em.setUser(ss[0]);
                em.setSecurityEntity(ss[1]);
                em.setPermit(ss[2]);
                col.add(em);
            }
        }
        return col;
    }


}
