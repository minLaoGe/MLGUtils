package com.minfengyu.cn.service;

import com.minfengyu.cn.entity.User;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDynamic implements InvocationHandler {

    private Object objects;

    public TestDynamic(Object objects) {
        this.objects = objects;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("befor exec");
        Object invoke = method.invoke(objects, args);
        System.out.println("after exec");
        return invoke;
    }
}
class JdkProxyFactory{
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),new TestDynamic(target));
    }

    public static void main(String[] args) {
        Serializable 北京 = (Serializable)JdkProxyFactory.getProxy(new User(32, "北京"));
        String s = 北京.toString();
        System.out.println(s);

    }
}