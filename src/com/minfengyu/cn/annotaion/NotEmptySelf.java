package com.minfengyu.cn.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})//注解的作用范围
@Retention(RetentionPolicy.RUNTIME)//注解的作用时长,运行时保留
public @interface NotEmptySelf {
    String message() default "";
}
