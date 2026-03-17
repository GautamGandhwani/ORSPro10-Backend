package com.rays.dao;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DEPARTMENT")
public class DepartmentDTO extends BaseDTO{

	@Column(name = "DEPARTMENT_CODE", length = 50)
	private String departmentCode;
	
	@Column(name = "DEPARTMENT_NAME", length = 50)
	private String departmentName;
	
	@Column(name = "DEPARTMENT_HEAD", length = 50)
	private String departmentHead;
	
	@Column(name = "DEPARTMENT_STATUS", length = 50)
	private String departmentStatus;

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	public String getDepartmentStatus() {
		return departmentStatus;
	}

	public void setDepartmentStatus(String departmentStatus) {
		this.departmentStatus = departmentStatus;
	}

	@Override
	public String getValue() {
		return departmentCode;
	}

	@Override
	public String getUniqueKey() {
		return "departmentCode";
	}

	@Override
	public String getUniqueValue() {
		return departmentCode;
	}

	@Override
	public String getLabel() {
		return "Department";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("departmentCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("departmentCode", departmentCode);
		return map;
	}

	
}