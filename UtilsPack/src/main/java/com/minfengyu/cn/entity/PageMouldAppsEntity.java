package com.minfengyu.cn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Tom.Min
 * @email b1692245586@gmail.com
 * @date 2021-07-29 09:19:56
 */
@Data
@TableName("page_mould_apps")
public class PageMouldAppsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@TableField("id")
	private Long id;
	/**
	 * 图片url地址
	 */
	@TableField("icon_pic_url")
	@NotEmpty(message = "图片地址不能为空")
	private String iconPicUrl;
	/**
	 * 跳转地址
	 */
	@TableField("icon_url")
	private String iconUrl;
	/**
	 * 模块的优先级
	 */
	@TableField("app_icon_order")
	@NotEmpty(message = "图片的icon顺序不能为空")
	private Integer appIconOrder;
	/**
	 * 一级页面的id
	 */
	@TableField("parent_id")
	@NotEmpty(message = "一级模块不能为空")
	private Long parentId;

	/**
	 * 模块说明
	 */
	@TableField("icon_explain")
	private String iconExplain;
	/**
	 * 图片标题
	 */
	@TableField("title")
	@NotEmpty(message = "标题不能为空")
	private String title;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 更新时间
	 */
	@TableField("update_time")
	private Date updateTime;
	/**
	 * 创建人名字
	 */
	@TableField("creator_name")
	private String creatorName;
	/**
	 * 创建人id
	 */
	@TableField("creator_id")
	private Long creatorId;


	/*
	*
	* 是否上线(0-未上线,1-已上线,2-已下线,3-已删除)
	* */
	@TableField("if_enable")
	private Byte ifEnable;
	/**
	 * 更新人名字
	 */
	@TableField("update_user_name")
	private String updateUserName;
	/**
	 * 更新人id
	 */
	@TableField("update_user_id")
	private Long updateUserId;

	/**
	 * 是否显示图片下面的文字
	 */
	@TableField("if_obvirous_pic_word")
	private Byte ifObvirousPicWord;
}
