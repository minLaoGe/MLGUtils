package com.minfengyu.cn.service;

import com.minfengyu.cn.entity.User;

import java.util.Optional;
import java.util.function.Supplier;

public class TestNullAbleValue {
    public static void main(String[] args) {
        User user=null;

        User user1 = Optional.ofNullable(user).orElseGet(() -> new User(3, "北京"));
       Optional.ofNullable(user).filter(s->"sdf".equals(s.getName())).ifPresent(s->s.getAge());

    }
    protected void getYou() throws RuntimeException{

    }
}
