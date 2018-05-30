package com.xxh.fang.entity;

import java.io.Serializable;

public class ChangeCustomerStatusVo implements Serializable{

	
	public  static final long serialVersionUID = 4697206567379149764L;
	/**
	 * 客户ID(业务标识101+10位自增数)
	 */
	public Long customerId;
	
	/**
	 * 新状态customerStatus
	 */
	public Integer newCustomerStatus;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getNewCustomerStatus() {
		return newCustomerStatus;
	}

	public void setNewCustomerStatus(Integer newCustomerStatus) {
		this.newCustomerStatus = newCustomerStatus;
	}
	
}
