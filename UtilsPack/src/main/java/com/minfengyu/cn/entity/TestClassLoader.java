package com.minfengyu.cn.entity;

import com.sun.crypto.provider.DESKeyFactory;
import sun.misc.Launcher;

import java.net.URL;

public class TestClassLoader {
    public static void main(String[] args) {
            String str="dicKey=SDFSDFSDFSFD;";
        String keyStr = "dicKey=";
        int i2 = str.indexOf(keyStr);
            i2+=keyStr.length();
            int i3 = str.indexOf(";", i2);
            System.out.println(str.substring(i2,i3));
    }
}
