package com.minfengyu.cn.service;

import com.minfengyu.cn.entity.User;

import java.util.ArrayList;

/**
 * @Author: Tom.Min
 * @Date: 2021/9/8 9:25
 * @Desc:
 */
public class TestMemory extends TestNullAbleValue {
   /* public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            User sdf = User.builder().name("sdf").age(234).build();
            users.add(sdf);
        }
        System.out.println(1);
    }*/
   public static void main(String[] args) {
       String sd="3";
       String sr="4";
       new TestMemory().swapStr(sd,sr);
       System.out.println(sr);
       System.out.println(sd);
   }
   public void swapStr(String a,String b){
       String c=b;
       b=a;
       a=c;
   }
    @Override
    protected void getYou() {
    }
}
