package com.alby.dp.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/16.
 * 享元工厂
 */
public class FlyweightFactory {

    //缓存
    private Map<String,Flyweight> fsMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key){
        //这个方法里面基本实现步骤如下
        //1：先从缓存里面查找，是否存在key对应的Flyweight对象
        Flyweight f = fsMap.get(key);
        //2：如果存在就返回相对应的Flyweight对象
        if (f==null){
            //如果不存在
            //创建一个新的Flyweight对象
            f = new ConcreteFlyweight(key);
            //将新的Flyweight对象添加到缓存里面
            fsMap.put(key,f);
            //然后返回这个心的Flyweight对象
        }
        return f;
    }
}
