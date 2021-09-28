package com.minfengyu.cn.service.testString;

import com.minfengyu.cn.entity.User;

public class StringTest {

    public static void main(String[] args) {
        User user = new User(34,"张");
        swapUser(user);
        System.out.println(user);
    }

    private static void swapUser(User user) {
        user=new User(32,"里");
    }
}
