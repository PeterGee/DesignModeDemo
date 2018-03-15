package net.petergee.designmodedemo.designmode.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理律师类
 *
 * @author petergee
 * @date 2018/3/15
 */

public class DynamicLawyer {

    private Object mObject;

    /**
     * Object类型对象通过构造传递 ，更加灵活
     * @param o
     */
    public DynamicLawyer(Object o) {
        this.mObject = o;
    }

    /**
     * 获取动态代理对象
     * 参数：classLoader 、interface、InvocationHandler
     */
    public Object getDynamicProxy() {
        return Proxy.newProxyInstance(mObject.getClass().getClassLoader(), mObject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object value = method.invoke(mObject, args);
                return value;
            }
        });
    }

}
