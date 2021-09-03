package com.minfengyu.cn.controller;

import com.minfengyu.cn.service.TestBService;
import com.minfengyu.cn.service.TestCService;
import com.minfengyu.cn.utils.MyMap;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.rmi.activation.ActivationException;

/**
 * @Author: Tom.Min
 * @Date: 2021/7/21 16:15
 * @Desc:
 */
@RestController
@RequestMapping("/d")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestThreadLocal {
    private final TestBService testBService;
    private final TestCService testCService;

    @RequestMapping("/sdf")
    @Transactional
    public String get(HttpServletRequest request) throws ActivationException {
        testBService.update();
        //回滚
//        int a=1/0;
        testCService.insert();
        throw new ActivationException();
    }
}
