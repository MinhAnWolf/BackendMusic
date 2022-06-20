package com.service.client.BaseReponse;

public class BaseListResponse extends BaseResponse {
	private int total;
	private int limit;

	public BaseListResponse(String errCode, String descCode, Object data,int total,int limit) {
		super(errCode, descCode, data);
		this.total = total;
		this.limit = limit;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
