package com.minfengyu.cn.service.jvm;

import java.lang.reflect.Member;

public class FieldHasNoPolymorphic {
    static class Father{
        public int money=1;
        public Father(){
            money=2;
            showMeMoney();
        }

        public void showMeMoney() {
            System.out.println("I am father;i have $"+money);
        }

    }
    static class Son extends Father{
        public int money=3;
        public Son(){
            money=4;
            showMeMoney();
        }

        @Override
        public void showMeMoney() {
            System.out.println("I am the son, I have $"+ money);
        }
    }

    public static void main(String[] args) {
        Father gy = new Son();
        System.out.println(gy.money);
//        System.out.println("this gy has$"+ gy.money);
    }
}
