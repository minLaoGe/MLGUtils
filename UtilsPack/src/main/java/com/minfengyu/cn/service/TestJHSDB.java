package com.minfengyu.cn.service;

/**
 * @Author: Tom.Min
 * @Date: 2021/8/17 10:01
 * @Desc:
 */
public class TestJHSDB {
    static class Test{
        static ObjectHolder staticObj=new ObjectHolder();
        ObjectHolder instanceHoder=new ObjectHolder();
        void foo(){
            ObjectHolder objectHolder = new ObjectHolder();
            System.out.println(objectHolder);
        }
    }
    private static  class ObjectHolder{}

    public static void main(String[] args) {
        Test testJHSDB = new TestJHSDB.Test();
        testJHSDB.foo();
    }
}
