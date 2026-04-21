package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DATARETENTION")
public class DataRetentionDTO extends BaseDTO{

	@Column(name = "RETENTION_CODE", length = 50)
	private String retentionCode;
	
	@Column(name = "RETINTION_TYPE", length = 50)
	private String retentionType;
	
	@Column(name = "DURATION")
	private Integer duration;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getRetentionCode() {
		return retentionCode;
	}

	public void setRetentionCode(String retentionCode) {
		this.retentionCode = retentionCode;
	}

	public String getRetentionType() {
		return retentionType;
	}

	public void setRetentionType(String retentionType) {
		this.retentionType = retentionType;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return retentionCode;
	}

	@Override
	public String getUniqueKey() {
		return "retentionCode";
	}

	@Override
	public String getUniqueValue() {
		return retentionCode;
	}

	@Override
	public String getLabel() {
		return "Data Retention";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("retentionCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("retentionCode", retentionCode);
		return map;
	}
}
