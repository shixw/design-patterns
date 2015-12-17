package com.alby.dp.flyweight.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/17.
 * 不需要共享的享元对象的实现，也是组合模式中的组合对象
 */
public class UNshareConcreteFlyweight implements Flyweight {

    //记录每个组合对象所包含的子组件
    private List<Flyweight> list = new ArrayList<Flyweight>();
    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight flyweight : list) {
            if (flyweight.match(securityEntity,permit)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Flyweight f) {
            list.add(f);
    }
}
