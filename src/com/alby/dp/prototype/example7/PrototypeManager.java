package com.alby.dp.prototype.example7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/2.
 * 原型管理器
 */
public class PrototypeManager {
    //缓存map
    private static Map<String,Prototype> map = new HashMap<String, Prototype>();

    private PrototypeManager() {

    }

    //注册
    public synchronized static void setPrototype(String prototypeId,Prototype prototype){
        map.put(prototypeId,prototype);
    }

    //销毁
    public synchronized static void removePrototype(String prototypeId){
        map.remove(prototypeId);
    }

    //获取
    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);
        if (prototype == null){
            throw new Exception("没有注册或已被销毁");
        }
        return prototype;
    }

}
