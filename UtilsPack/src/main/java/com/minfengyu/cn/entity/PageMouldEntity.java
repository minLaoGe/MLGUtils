package com.minfengyu.cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author Tom.Min
 * @email b1692245586@gmail.com
 * @date 2021-07-29 09:19:56
 */
@Data
@TableName("page_mould")
public class PageMouldEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 * 模块的优先级
	 */
	private Integer moduleOrder;
	/**
	 * 是否有更多按钮(0-没有,1-有)
	 */
	private Byte ifMore;
	/**
	 * 点击更多的跳转url
	 */
	private String moreUrl;
	/**
	 * 模块名称
	 */
	private String moduleName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 对应的模块的key
	 */
	private String moduelKey;
	/**
	 * 是否显示模块名字(0-不显示,1-显示)
	 */
	private Byte ifObviousModuleName;
	/*
	 * 是否上线(0-未上线,1-已上线,2-已下线,3-已删除)
	 * */
	private Byte ifEnable;
	private String creatorName;

	private Long creatorId;
	/**
	 * 更新人名字
	 */
	private String updateUserName;
	/**
	 * 更新人id
	 */
	private Long updateUserId;

	@TableField(select = false)
	private List<PageMouldAppsEntity> appsEntityList;

}
