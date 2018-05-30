package com.xxh.fang.entity;

import java.io.Serializable;

public class RetrievePasswordVo implements Serializable{
	
	
	
	 /**
	 * 
	 */
	public static final long serialVersionUID = -7846792932599966356L;

	public String mobilePhone;
	
	public String newLoginPassword;
	
	public Integer VerificationCode;

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getNewLoginPassword() {
		return newLoginPassword;
	}

	public void setNewLoginPassword(String loginPassword) {
		this.newLoginPassword = loginPassword;
	}

	public Integer getVerificationCode() {
		return VerificationCode;
	}

	public void setVerificationCode(Integer verificationCode) {
		VerificationCode = verificationCode;
	}
	
	
	

}
