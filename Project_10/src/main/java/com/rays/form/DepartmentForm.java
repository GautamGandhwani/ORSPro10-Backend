package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dao.DepartmentDTO;

public class DepartmentForm extends BaseForm{

	@NotEmpty(message = "please enter department code")
	private String departmentCode;
	
	@NotEmpty(message = "please enter department name")
	private String departmentName;
	
	@NotEmpty(message = "please enter department head")
	private String departmentHead;
	
	@NotEmpty(message = "please enter department status")
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
	public BaseDTO getDto() {
		
		DepartmentDTO dto = initDTO(new DepartmentDTO());
		dto.setDepartmentCode(departmentCode);
		dto.setDepartmentName(departmentName);
		dto.setDepartmentHead(departmentHead);
		dto.setDepartmentStatus(departmentStatus);
		return dto;
	}
}