package com.alby.dp.flyweight.example5;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2015/12/16.
 * 安全管理，实现成单例
 */
public class SecurityMgr {

    private static SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr() {
    }

    public static SecurityMgr getInstance() {
        return securityMgr;
    }

    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = this.queryByUser(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + " 没有登录或是没有被分配任何权限");
            return false;
        }
        for (Flyweight model : col) {
            //输出当前实例，看看是否为同一个实例对象
            System.out.println("am==" + model);
            if (model.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;

    }

    //从数据库中获取某人所拥有的权限
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<Flyweight>();

        for (String s : TestDB.colDB) {
            String[] ss = s.split(",");
            if (ss[0].equals(user)) {
                Flyweight flyweight = null;
                if (ss[3].equals("2")) {
                    //表示时组合
                    flyweight = new UNshareConcreteFlyweight();
                    String tempSs[] = TestDB.mapDB.get(ss[1]);
                    for (String tempS : tempSs) {
                        Flyweight tempFm = FlyweightFactory.getInstance().getFlyweight(tempS);
                        //将对象添加到组合对象中
                        flyweight.add(tempFm);
                    }
                } else {
                    flyweight = FlyweightFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
                }
                col.add(flyweight);
            }
        }
        return col;
    }


}
