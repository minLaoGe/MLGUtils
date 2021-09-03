package com.minfengyu.cn.utils;

/**
 * @Author: Tom.Min
 * @Date: 2021/8/6 11:21
 * @Desc:
 */
public class TestAgeImpression {
    private static  int _1MB=1024*1024;
    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[_1MB/4];
        allocation2=new byte[_1MB/4];
        allocation3=new byte[4*_1MB];
        allocation4=new byte[4*_1MB];
        allocation4=null;
//        allocation4=new byte[4*_1MB];
    }
}
