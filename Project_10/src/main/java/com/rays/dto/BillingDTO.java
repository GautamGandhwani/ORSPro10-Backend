package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_BILLING")
public class BillingDTO extends BaseDTO{

	@Column(name = "BILLING_CODE", length = 50)
	private String billingCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "AMOUNT", length = 50)
	private Integer amount;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getBillingCode() {
		return billingCode;
	}

	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return billingCode;
	}

	@Override
	public String getUniqueKey() {
		return "billingCode";
	}

	@Override
	public String getUniqueValue() {
		return billingCode;
	}

	@Override
	public String getLabel() {
		return "Billing";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("billingCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("billingCode", billingCode);
		return map;
	}
}
