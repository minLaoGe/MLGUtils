package com.minfengyu.cn.service;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Tom.Min
 * @Date: 2021/8/20 14:58
 * @Desc:
 */
public class BTraceTest {
    public int add(int a, int b) {
        return a + b;
    }


    @SneakyThrows
   /* public static void main(String[] args) throws IOException {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(()->{
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
        }) {   };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(()->{
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try { Thread.sleep(100);} catch (Exception e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        }) { };


        t1.start();
        t2.start();
    }*/
    public static void main(String[] args) {
        final String resource1 = "士大夫十分";
        final String resource2 = "士大夫十分sdfsf士大夫";
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println(3);
                }
            }});
            Thread t2 = new Thread(() -> {
                synchronized (resource2) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println(2);
                    }
                }
            }) {
            };
            t1.start();
            t2.start();
        }

    }
class T2{
    public static void main(String[] args) {
        final String resouce1="ratan jaiswal";
        final String resouce2="vimal jaiswal";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (resouce1){
                    System.out.println("Thread1: lokced resource 1");
                    try { Thread.sleep(100); }catch (Exception e){}
                    synchronized (resouce2){
                        System.out.println("Thread 1: locked resource2");
                    }
                }
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                synchronized (resouce2){
                    System.out.println("Thread 2:loked resource 2");

                    try{Thread.sleep(100);}catch (Exception exception){}

                    synchronized (resouce1){
                        System.out.println("Thread 2: loked resouce 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();

    }
}