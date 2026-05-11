package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_GENDER")
public class GenderDTO extends BaseDTO{

	@Column(name = "GENDER_CODE", length = 50)
	private String genderCode;
	
	@Column(name = "GENDER_TYPE", length = 50)
	private String genderType;
	
	@Column(name = "DESCRIPTION", length = 50)
	private String description;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return genderCode;
	}

	@Override
	public String getUniqueKey() {
		return "genderCode";
	}

	@Override
	public String getUniqueValue() {
		return genderCode;
	}

	@Override
	public String getLabel() {
		return "Gender";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("genderCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("genderCode", genderCode);
		return map;
	}
}
