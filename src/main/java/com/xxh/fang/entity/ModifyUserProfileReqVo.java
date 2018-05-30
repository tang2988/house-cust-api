package com.xxh.fang.entity;

import java.io.Serializable;

public class ModifyUserProfileReqVo implements Serializable {
	/**
	 * 
	 */
	public static final long serialVersionUID = -1788525767728401888L;
	/**
	 * 客户ID(业务标识101+10位自增数)
	 */
	public Long customerId;
	/**
	 * 用户头像
	 */
	public String headerIconUrl;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getHeaderIconUrl() {
		return headerIconUrl;
	}

	public void setHeaderIconUrl(String headerIconUrl) {
		this.headerIconUrl = headerIconUrl;
	}

}
