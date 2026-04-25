package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ACCESSLOG")
public class AccessLogDTO extends BaseDTO{

	@Column(name = "ACCESSLOG_CODE", length = 50)
	private String accessLogCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "ACCES_TIME")
	private Date accessTime;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getAccessLogCode() {
		return accessLogCode;
	}

	public void setAccessLogCode(String accessLogCode) {
		this.accessLogCode = accessLogCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return accessLogCode;
	}

	@Override
	public String getUniqueKey() {
		return "accessLogCode";
	}

	@Override
	public String getUniqueValue() {
		return accessLogCode;
	}

	@Override
	public String getLabel() {
		return "Access Log";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("accessLogCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("accessLogCode", accessLogCode);
		return map;
	}
}
