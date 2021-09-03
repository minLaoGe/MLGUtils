package com.minfengyu.cn.service;

import com.minfengyu.cn.dao.PageMouldDao;
import com.minfengyu.cn.entity.PageMouldEntity;
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
public class TestCService {
        private final PageMouldDao mouldDao;

        @Transactional
        public void insert(){

            PageMouldEntity pageMouldEntity = new PageMouldEntity();
            pageMouldEntity.setModuelKey("sdf");
            mouldDao.insert(pageMouldEntity);
        }
}
