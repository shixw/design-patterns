package com.alby.dp.flyweight.example5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/16.
 * 供测试用，在内存中模式数据库中的值
 */
public class TestDB {
    public static Collection<String> colDB = new ArrayList<String>();

    //用来存放组合授权数据的值，key为组合数据的id，value为该组合包含的多条授权数据的值
    public static Map<String,String[]> mapDB = new HashMap<String, String[]>();
    static {
        colDB.add("张三,人员列表,查看,1");
        colDB.add("李四,人员列表,查看,1");
        colDB.add("李四,操作薪资数据,,2");

        mapDB.put("操作薪资数据",new String[]{"薪资数据,查看","薪资数据,修改"});
        //增加更多的授权数据
        for (int i = 0; i < 3; i++) {
            colDB.add("张三"+i+",人员列表,查看,1");
        }
    }
}
