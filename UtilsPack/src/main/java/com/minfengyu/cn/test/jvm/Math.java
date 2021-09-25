package com.minfengyu.cn.test.jvm;

import org.apache.tomcat.jni.User;

public class Math {
    public static final int initData=666;
    public static User user=new User();
    public static  int asd=234;

    public int compute(){
        int a=1;
        int b=2;
        int c=(a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();
    }
}
