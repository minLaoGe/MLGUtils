package com.minfengyu.cn.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @Author: Tom.Min
 * @Date: 2021/9/8 9:25
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable,Person {
    private Integer age=23;
    private String name="sdf";
    public void say(){
        System.out.println(name+age);
    }


    @Override
    public String toString() {

        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public String tostring() {
        return null;
    }
}
