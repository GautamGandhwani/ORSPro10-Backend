package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_INSURANCE")
public class InsuranceDTO extends BaseDTO {

	@Column(name = "POLICY_NUMBER", length = 50)
	private String policyNumber;

	@Column(name = "PREMIUM_AMOUNT")
	private Double premiumAmount;

	@Column(name = "EXPIRY_DATE")
	private Date expiryDate;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String getValue() {
		return policyNumber;
	}

	@Override
	public String getUniqueKey() {
		return "policyNumber";
	}

	@Override
	public String getUniqueValue() {
		return policyNumber;
	}

	@Override
	public String getLabel() {
		return "Insurance";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("policyNumber", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("policyNumber", policyNumber);
		return map;
	}
}