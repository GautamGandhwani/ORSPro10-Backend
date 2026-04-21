package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_APIKEY")
public class APIKeyDTO extends BaseDTO{

	@Column(name = "APIKEY_CODE", length = 50)
	private String apiKeyCode;
	
	@Column(name = "KEY_VALUE", length = 50)
	private String keyValue;
	
	@Column(name = "ISSUED_TO", length = 50)
	private String issuedTo;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getApiKeyCode() {
		return apiKeyCode;
	}

	public void setApiKeyCode(String apiKeyCode) {
		this.apiKeyCode = apiKeyCode;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return apiKeyCode;
	}

	@Override
	public String getUniqueKey() {
		return "apiKeyCode";
	}

	@Override
	public String getUniqueValue() {
		return apiKeyCode;
	}

	@Override
	public String getLabel() {
		return "APIKey";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("apiKeyCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("apiKeyCode", apiKeyCode);
		return map;
	}
}
