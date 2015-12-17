package com.alby.dp.flyweight.example5;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by xianwei on 2015/12/16.
 * 享元工厂，通常实现成为单例
 */
public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();


    private FlyweightFactory() {
        Thread t = new ClearCache();
        t.start();
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    //用来缓存被共享对象的缓存配置，key值和上面map的一样
    private Map<String, CacheConfModel> confModelMap = new HashMap<String, CacheConfModel>();
    //缓存多个Flyweight对象
    private Map<String, Flyweight> fsMap = new HashMap<String, Flyweight>();

    //用来记录缓存对象被引用的次数，key值和上面map的一样
    private Map<String, Integer> countMap = new HashMap<String, Integer>();
    //默认保存6秒
    private final long DURABLE_TIME = 6 * 1000L;

    public synchronized int getUseTimes(String key) {
        Integer count = countMap.get(key);
        if (count == null) {
            count = 0;
        }
        return count;
    }

    //获取key对应的享元对象
    public Flyweight getFlyweight(String key) {
        Flyweight f = fsMap.get(key);
        if (f == null) {
            f = new AuthorizationFlyweight(key);
            fsMap.put(key, f);
            countMap.put(key, 1);

            CacheConfModel cm = new CacheConfModel();
            cm.setBeginTime(System.currentTimeMillis());
            cm.setForever(false);
            cm.setDurableTime(DURABLE_TIME);

            confModelMap.put(key, cm);
        } else {
            CacheConfModel cm = confModelMap.get(key);
            cm.setBeginTime(System.currentTimeMillis());

            this.confModelMap.put(key, cm);

            Integer count = countMap.get(key);
            count++;
            countMap.put(key, count);

        }
        return f;
    }
    //删除key对应的享元对象，连带清除对应的缓存配置和引用次数
    private synchronized void removeFlyweight(String key){
        this.fsMap.remove(key);
        this.confModelMap.remove(key);
        this.countMap.remove(key);
    }

    //维护清除缓存的线程，内部使用
    private class ClearCache extends Thread{
        @Override
        public void run() {
            while (true) {
                Set<String> tempSet = new HashSet<String>();
                Set<String> set = confModelMap.keySet();
                for (String key : set) {
                    CacheConfModel ccm = confModelMap.get(key);

                    if (System.currentTimeMillis() - ccm.getBeginTime() >= ccm.getDurableTime()) {
                        //可以清除，先记录下来
                        tempSet.add(key);
                    }
                }

                for (String key : tempSet) {
                    FlyweightFactory.getInstance().removeFlyweight(key);
                }

                System.out.println("now thread = " + fsMap.size() + ",fsmap=" + fsMap.keySet());

                //休息一秒
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
