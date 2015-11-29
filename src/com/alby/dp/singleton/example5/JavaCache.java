package com.alby.dp.singleton.example5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/11/29.
 * Java缓存的基本实现
 *
 * 1：定义一个存放缓存数据的容器
 * 2：从缓存中获取数据的做法
 * 2.1：先从缓存里面取值
 * 2.3：判断缓存里面是否有值   如果有值，直接使用
 * 2.4： 如果没有就去获取相应的值或对象
 * 2.4.1：将数据设置回缓存中
 */
public class JavaCache {
    /**
     * 缓存数据的容器，定义成Map是方便访问，直接根据Key就可以获取value
     *
     */
    private Map<String,Object> map = new HashMap<String, Object>();

    /**
     * 从缓存中获取值
     * @param key   设置时候的key值
     * @return  key对应的value值
     */
    public Object getValue(String key){
        //先从缓存中获取值
        Object obj = map.get(key);
        if (obj==null){
            //如果没有，那么就去获取相应的数据，比如读取数据库或者文件

            obj = key + ",value";
            //吧获取得值设置会缓存里面
            map.put(key,obj);
        }
        return obj;
    }
}
