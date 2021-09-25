package com.minfengyu.cn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Son extends User{

    public Son(Integer age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
