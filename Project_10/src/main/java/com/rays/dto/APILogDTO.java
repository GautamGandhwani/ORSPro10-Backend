package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_APILOG")
public class APILogDTO extends BaseDTO{

	@Column(name = "API_CODE", length = 50)
	private String apiCode;
	
	@Column(name = "API_NAME", length = 50)
	private String apiName;
	
	@Column(name = "REQUEST_TIME")
	private LocalDate requestTime;
	
	@Column(name = "RESPONSE_STATUS", length = 50)
	private String responseStatus;

	public String getApiCode() {
		return apiCode;
	}

	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public LocalDate getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(LocalDate requestTime) {
		this.requestTime = requestTime;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	@Override
	public String getValue() {
		return apiCode;
	}

	@Override
	public String getUniqueKey() {
		return "apiCode";
	}

	@Override
	public String getUniqueValue() {
		return apiCode;
	}

	@Override
	public String getLabel() {
		return "APILog";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("apiCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("apiCode", apiCode);
		return map;
	}
}