package com.minfengyu.cn.service.jvm;

import java.util.Arrays;

public class TestInit {
    static {
        System.out.println("Superclass init!");
    }
    public  final    static String value="hello world";
}

class SubjectInit extends TestInit{
    static {
        System.out.println("Subject init");
    }


}
class Notitaion{
    public static void main(String[] args) {
        System.out.println(SubjectInit.value);

        /* TestInit[] sca=new TestInit[12];
        System.out.println(Arrays.toString(sca));*/
    }
}