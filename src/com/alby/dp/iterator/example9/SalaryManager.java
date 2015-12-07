package com.alby.dp.iterator.example9;


/**
 * Created by xianwei on 2015/12/7.
 * 被客户方收购的那个公司的工资管理类
 */
public class SalaryManager {

    /**
     * 使用数组管理
     */
    private PayModel[] pms = null;

    /**
     * 获取工资列表
     */
    public PayModel[] getPays() {
        return pms;
    }

    /**
     * 计算工资，其实应该有很多参数，为了演示从简
     */
    public void calcSalary() {
        PayModel pm1 = new PayModel();
        pm1.setPay(2200);
        pm1.setUserName("王五");

        PayModel pm2 = new PayModel();
        pm2.setPay(3600);
        pm2.setUserName("赵六");
        PayModel pm3 = new PayModel();
        pm3.setPay(22004);
        pm3.setUserName("王五5");

        PayModel pm4 = new PayModel();
        pm4.setPay(36004);
        pm4.setUserName("赵六4");
        PayModel pm5 = new PayModel();
        pm5.setPay(22005);
        pm5.setUserName("王五5");

        PayModel pm6 = new PayModel();
        pm6.setPay(36006);
        pm6.setUserName("赵六6");

        pms = new PayModel[6];
        pms[0] = pm1;
        pms[1] = pm2;
        pms[2] = pm3;
        pms[3] = pm4;
        pms[4] = pm5;
        pms[5] = pm6;


    }

    public Iterator createIterator() {
        return new ArrayIteratorImpl(this);
    }

    public int size() {
        return pms.length;
    }

    public Object get(int index) {
        Object retObj = null;
        if (index < pms.length) {
            retObj = pms[index];
        }
        return retObj;
    }
}
