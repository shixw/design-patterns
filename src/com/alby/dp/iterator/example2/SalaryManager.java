package com.alby.dp.iterator.example2;

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

        pms = new PayModel[2];
        pms[0] = pm1;
        pms[1] = pm2;
    }
}
