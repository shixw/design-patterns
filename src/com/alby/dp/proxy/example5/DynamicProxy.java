package com.alby.dp.proxy.example5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xianwei on 2015/12/4.
 * Java中的动态代理实现 只能代理接口
 */
public class DynamicProxy implements InvocationHandler {
    private OrderApi order = null;

    /**
     * 获取绑定好的代理和具体的目标对象后的目标对象的接口
     * @param order 具体的订单对象，相当于具体目标对象
     * @return  绑定好代理和具体目标对象后的目标对象的接口
     */
    public OrderApi getProxyInterface(Order order) {
        //设置被代理的对象，好方便invoke里面操作
        this.order = order;

        //把真正的订单对象和动态代理关联起来

        return (OrderApi) Proxy.newProxyInstance(
                        order.getClass().getClassLoader(),
                        order.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("set")){
            if (order.getOrderUser()!=null && order.getOrderUser().equals(args[1])){
                return method.invoke(order,args);
            }else{
                System.out.println("无操作权限");
            }
        }else
            return method.invoke(order,args);
        return null;
    }
}
