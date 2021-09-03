package com.minfengyu.cn.service;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Tom.Min
 * @Date: 2021/8/18 10:58
 * @Desc:
 */
 class OOMObject{
    public byte[] placeholder=new byte[64*1024];
}
public class TestJConsole {
    public static void fillHeap(int num) throws  Exception{
        List<OOMObject> list=new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(200);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception {
        fillHeap(1000);
    }
}
