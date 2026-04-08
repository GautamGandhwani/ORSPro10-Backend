package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_TIMEZONE")
public class TimeZoneDTO extends BaseDTO{

	@Column(name = "TIMEZONE_CODE", length = 50)
	private String timezoneCode;
	
	@Column(name = "TIMEZONE_NAME", length = 50)
	private String timezoneName;
	
	@Column(name = "OFFSET", length = 50)
	private String offset;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getTimezoneCode() {
		return timezoneCode;
	}

	public void setTimezoneCode(String timezoneCode) {
		this.timezoneCode = timezoneCode;
	}

	public String getTimezoneName() {
		return timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return timezoneCode;
	}

	@Override
	public String getUniqueKey() {
		return "timezoneCode";
	}

	@Override
	public String getUniqueValue() {
		return timezoneCode;
	}

	@Override
	public String getLabel() {
		return "TimeZone";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("timezoneCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("timezoneCode", timezoneCode);
		return map;
	}
}