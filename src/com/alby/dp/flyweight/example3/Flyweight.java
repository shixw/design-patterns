package com.alby.dp.flyweight.example3;

/**
 * Created by xianwei on 2015/12/16.
 * 描述授权数据的享元接口
 */
public interface Flyweight {

    /**
     * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
     * @param securityEntity 安全实体
     * @param permit 全
     * @return true 匹配  false 不匹配
     */
    public boolean match(String securityEntity,String permit);
}
