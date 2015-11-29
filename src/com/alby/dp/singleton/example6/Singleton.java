package com.alby.dp.singleton.example6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/11/29.
 * 饿汉式单例实现
 */
public class Singleton {
    private final static String DEFAULT_KEY = "One";

    private static Map<String, Singleton> map = new HashMap<String, Singleton>();


    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton instance = map.get(DEFAULT_KEY);
        if (instance == null) {
            instance = new Singleton();
            map.put(DEFAULT_KEY, instance);
        }
        return instance;
    }
}
