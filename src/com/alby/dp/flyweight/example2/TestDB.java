package com.alby.dp.flyweight.example2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2015/12/16.
 * 供测试用，在内存中模式数据库中的值
 */
public class TestDB {
    public static Collection<String> colDB = new ArrayList<String>();

    static {
        colDB.add("张三,人员列表,查看");
        colDB.add("李四,人员列表,查看");
        colDB.add("李四,薪资数据,查看");
        colDB.add("李四,薪资数据,修改");

        //增加更多的授权数据
        for (int i = 0; i < 3; i++) {
            colDB.add("张三"+i+",人员列表,查看");
        }
    }
}
