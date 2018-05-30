package com.xxh.fang.entity;

import java.io.Serializable;
import java.util.Date;

public class UserAuthenticationVo implements Serializable{
	
	
	
	/**
	 * 
	 */
	public static final long serialVersionUID = -8233798339838739947L;
	/**
	 * 客户ID(业务标识101+10位自增数)
	 */
	public Long customerId;
	/**
	 * 用户头像
	 */
	public Integer authentic;
	
	/**
	 * 认证时间
	 */
	public Date authenticTime;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getAuthentic() {
		return authentic;
	}

	public void setAuthentic(Integer authentic) {
		this.authentic = authentic;
	}

	public Date getAuthenticTime() {
		return authenticTime;
	}

	public void setAuthenticTime(Date authenticTime) {
		this.authenticTime = authenticTime;
	}
}
