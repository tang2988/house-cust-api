package com.xxh.fang.Util;

import java.io.Serializable;

public class ResVo implements Serializable {
	
	public  static final long serialVersionUID = -5135791201594271488L;
	public Boolean Success = false;
	public String msg;
	public Object data;

	public Boolean getSuccess() {
		return Success;
	}

	public void setSuccess(Boolean success) {
		Success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Resbo [Success=" + Success + ", msg=" + msg + ", data=" + data + "]";
	}

}
