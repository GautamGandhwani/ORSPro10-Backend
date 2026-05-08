package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CONFIRMPASSWORD")
public class ConfirmPasswordDTO extends BaseDTO{

	@Column(name = "CONFIRM_CODE", length = 50)
	private String confirmCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "CONFIRM_VALUE", length = 50)
	private String confirmValue;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getConfirmCode() {
		return confirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getConfirmValue() {
		return confirmValue;
	}

	public void setConfirmValue(String confirmValue) {
		this.confirmValue = confirmValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return confirmCode;
	}

	@Override
	public String getUniqueKey() {
		return "confirmCode";
	}

	@Override
	public String getUniqueValue() {
		return confirmCode;
	}

	@Override
	public String getLabel() {
		return "Confirm Password";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("confirmCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("confirmCode", confirmCode);
		return map;
	}
}
