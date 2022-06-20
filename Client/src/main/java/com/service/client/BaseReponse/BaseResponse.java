package com.service.client.BaseReponse;

public class BaseResponse {
	private String errCode;
	private String descCode;
	private Object data;
	
	public BaseResponse(String errCode, String descCode, Object data) {
		this.errCode = errCode;
		this.descCode = descCode;
		this.data = data;
	}
	
	

	public BaseResponse() {}



	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getDescCode() {
		return descCode;
	}

	public void setDescCode(String descCode) {
		this.descCode = descCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
