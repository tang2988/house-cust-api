package com.xxh.fang.entity;

import java.math.BigDecimal;

public class ChangeAvailableBalanceVo {
	
	public Long out_accountId;
	
	public Long in_accountId;
	
	public  BigDecimal usableBalance;

	public  Integer bizType;
	public  String bizTypeName;
	
	public Long getOut_accountId() {
		return out_accountId;
	}

	public void setOut_accountId(Long out_accountId) {
		this.out_accountId = out_accountId;
	}

	public Long getIn_accountId() {
		return in_accountId;
	}

	public void setIn_accountId(Long in_accountId) {
		this.in_accountId = in_accountId;
	}

	public BigDecimal getUsableBalance() {
		return usableBalance;
	}

	public void setUsableBalance(BigDecimal usableBalance) {
		this.usableBalance = usableBalance;
	}

	public Integer getBizType() {
		return bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
	}

	public String getBizTypeName() {
		return bizTypeName;
	}

	public void setBizTypeName(String bizTypeName) {
		this.bizTypeName = bizTypeName;
	}
	
	

}
