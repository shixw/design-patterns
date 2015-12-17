package com.alby.dp.flyweight.example5;


/**
 * Created by xianwei on 2015/12/16.
 * 封装授权数据中重复出现部分的享元对象
 */
public class AuthorizationFlyweight implements Flyweight {

    //内部状态，安全实体
    private String securityEntity;

    //内部状态，权限
    private String permit;

    /**
     * 传入状态数据
     *
     * @param state 状态数据，包含安全实体和权限数据，用“,”分割
     */
    public AuthorizationFlyweight(String state) {
        String ss[] = state.split(",");
        securityEntity = ss[0];
        permit = ss[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        return this.securityEntity.equals(securityEntity) && this.permit.equals(permit);
    }

    @Override
    public void add(Flyweight f) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
