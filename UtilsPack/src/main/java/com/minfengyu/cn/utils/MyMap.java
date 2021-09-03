package com.minfengyu.cn.utils;


import java.util.ArrayList;

/**
 * @Author: Tom.Min
 * @Date: 2021/7/21 16:19
 * @Desc:
 */
public class MyMap {

    private static  int _1MB=1024*1024;
    public static MyMap SAVE_HOOK=null;
    public void isAlive(){
        System.out.println("yes, i am still alive");
    }
    @Override
    protected  void finalize() throws  Throwable{
     super.finalize();
        System.out.println("finalize method executed!");
        MyMap.SAVE_HOOK=this;
    }
    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[2*_1MB];
        allocation2=new byte[2*_1MB];
        allocation3=new byte[2*_1MB];
        allocation4=new byte[4*_1MB];//出现一次minor GC

    }
}
