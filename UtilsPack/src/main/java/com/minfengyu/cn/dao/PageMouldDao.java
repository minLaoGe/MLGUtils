package com.minfengyu.cn.dao;

//import io.renren.modules.pagemodule.generator.entity.PageMouldEntity;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.minfengyu.cn.entity.PageMouldEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author Tom.Min
 * @email b1692245586@gmail.com
 * @date 2021-07-29 09:19:56
 */
@Mapper
public interface PageMouldDao extends BaseMapper<PageMouldEntity> {
	    public List<PageMouldEntity> selectListAll(@Param("ew") QueryWrapper<PageMouldEntity> ew);
}
