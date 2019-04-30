package com.ccaf.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-12 17:59:16
 */
public class NotifyDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	private Long id;
	//
	private String content;
	//状态 -1暂存/0提交
	private String status;
	//链接地址
	private String linkAddress;
	//标题
	private String title;
	//类型（0为客户，1为设计师,3项目经理）
	private String type;
	//选择的人
	private List<Map<String,String>> selectorPerson;

	//0 微信/1站内信/2邮件/3其他
	private String channelType;

	private Date updateTime;

	private String selectors;

	private Long projectId;
	//被选用户id
	private Long[] userIds;

	private Long createUser;

	private Long updateUser;

	private Date createTime;

	private int rowNum;

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public List<Map<String, String>> getSelectorPerson() {
		return selectorPerson;
	}

	public void setSelectorPerson(
			List<Map<String, String>> selectorPerson) {
		this.selectorPerson = selectorPerson;
	}


	public String getSelectors() {
		return selectors;
	}

	public void setSelectors(String selectors) {
		this.selectors = selectors;
	}

	public Long[] getUserIds() {
		return userIds;
	}

	public void setUserIds(Long[] userIds) {
		this.userIds = userIds;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}



	/**

	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：链接地址
	 */
	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}
	/**
	 * 获取：链接地址
	 */
	public String getLinkAddress() {
		return linkAddress;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：类型（0为客户，1为设计师）
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型（0为客户，1为设计师）
	 */
	public String getType() {
		return type;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
}
