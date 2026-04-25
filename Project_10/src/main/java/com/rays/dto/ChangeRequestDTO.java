package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CHANGEREQUEST")
public class ChangeRequestDTO extends BaseDTO{

	@Column(name = "CHANGE_CODE", length = 50)
	private String changeCode;
	
	@Column(name = "TITLE", length = 50)
	private String title;
	
	@Column(name = "REQUEST_BY", length = 50)
	private String requestedBy;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getChangeCode() {
		return changeCode;
	}

	public void setChangeCode(String changeCode) {
		this.changeCode = changeCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return changeCode;
	}

	@Override
	public String getUniqueKey() {
		return "changeCode";
	}

	@Override
	public String getUniqueValue() {
		return changeCode;
	}

	@Override
	public String getLabel() {
		return "Change Request";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("changeCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("changeCode", changeCode);
		return map;
	}
}
