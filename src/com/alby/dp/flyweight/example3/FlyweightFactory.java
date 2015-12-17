package com.alby.dp.flyweight.example3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/16.
 * 享元工厂，通常实现成为单例
 */
public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance(){
        return factory;
    }

    //缓存多个Flyweight对象
    private Map<String,Flyweight> fsMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key){
        Flyweight f = fsMap.get(key);
        if (f==null){
            f = new AuthorizationFlyweight(key);
            fsMap.put(key,f);
        }
        return f;
    }
}
