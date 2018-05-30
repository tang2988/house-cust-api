package com.xxh.fang.entity;

import java.io.Serializable;

public class ChangeLoginPasswordVo implements Serializable{
	
	public static final long serialVersionUID = -6917058998717461159L;
	
	/**
	 * 客户ID(业务标识101+10位自增数)
	 */
	public Long customerId;
	
	/**
	 * 登录密码
	 */
	public String loginPassword;
	
	/**
	 * 新密码
	 */
	public String newloginPassword;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getNewloginPassword() {
		return newloginPassword;
	}

	public void setNewloginPassword(String newloginPassword) {
		this.newloginPassword = newloginPassword;
	}
	
	

}
