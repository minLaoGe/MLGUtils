package com.minfengyu.cn.service;

import com.minfengyu.cn.entity.User;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


import java.io.Serializable;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestCGLIBDynamic implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("befor exec");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("after exec");
        return invoke;
    }
}

class JdkProxyFactory2{
    public static Object getProxy(Class<?> clazz){
        //创建动态列
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new TestCGLIBDynamic());
        return enhancer.create();
    }

    public static void main(String[] args) {
//        Serializable 北京 = (Serializable)JdkProxyFactory.getProxy(new User(32, "北京"));
        Serializable 北京 = (Serializable)JdkProxyFactory2.getProxy(User.class);
        String s = 北京.toString();

    }
}