package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_USERSESSION")
public class UserSessionDTO extends BaseDTO{

	@Column(name = "SESSION_CODE", length = 50)
	private String sessionCode	;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "LOGIN_TIME")
	private Date loginTime;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getSessionCode() {
		return sessionCode;
	}

	public void setSessionCode(String sessionCode) {
		this.sessionCode = sessionCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return sessionCode;
	}

	@Override
	public String getUniqueKey() {
		return "sessionCode";
	}

	@Override
	public String getUniqueValue() {
		return sessionCode;
	}

	@Override
	public String getLabel() {
		return "User Session";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("sessionCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("sessionCode", sessionCode);
		return map;
	}
}
