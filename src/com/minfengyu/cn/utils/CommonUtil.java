package com.minfengyu.cn.utils;


import com.minfengyu.cn.annotaion.NotEmptySelf;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public class CommonUtil {

    /**
     * 判断对应注释的字符串是否为空，空抛出注解的异常
     *
     * @param workParam
     */
    public static void judgeIfNullThthrowException(Object workParam) {
        if (workParam instanceof List) {
            List param = (List) workParam;
            for (Object o : param) {
                CommonUtil.judgeIfNullThthrowException(o);
            }
        } else {
            Class<?> aClass = workParam.getClass();
            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                NotEmptySelf annotation = field.getDeclaredAnnotation(NotEmptySelf.class);
                if (!Objects.isNull(annotation)) {
                    try {
                        Object o = field.get(workParam);
                        if (Objects.isNull(o)) {
                            throw new RuntimeException(annotation.message());
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}
