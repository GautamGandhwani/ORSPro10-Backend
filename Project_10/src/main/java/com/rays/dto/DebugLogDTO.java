package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DEBUGLOG")
public class DebugLogDTO extends BaseDTO {

	@Column(name = "DEBUG_CODE", length = 50)
	private String debugCode;

	@Column(name = "MESSAGE", length = 50)
	private String message;

	@Column(name = "LOG_LEVEL", length = 50)
	private String logLevel;

	@Column(name = "STATUS", length = 50)
	private String status;

	public String getDebugCode() {
		return debugCode;
	}

	public void setDebugCode(String debugCode) {
		this.debugCode = debugCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return debugCode;
	}

	@Override
	public String getUniqueKey() {
		return "debugCode";
	}

	@Override
	public String getUniqueValue() {
		return debugCode;
	}

	@Override
	public String getLabel() {
		return "Debug Log";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("debugCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("debugCode", debugCode);
		return map;
	}
}
