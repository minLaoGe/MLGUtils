package com.minfengyu.cn.service;

import com.minfengyu.cn.dao.PageMouldAppsDao;
import com.minfengyu.cn.dao.PageMouldDao;
import com.minfengyu.cn.entity.PageMouldAppsEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Tom.Min
 * @Date: 2021/8/11 11:00
 * @Desc:
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestBService {

    private final PageMouldAppsDao mouldDao;

    @Transactional
    public void update(){
        PageMouldAppsEntity entity = new PageMouldAppsEntity();
        entity.setParentId(23423L);
        mouldDao.insert(entity);
    }

}
