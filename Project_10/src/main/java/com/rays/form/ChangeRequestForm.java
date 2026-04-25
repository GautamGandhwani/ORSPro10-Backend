package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ChangeRequestDTO;

public class ChangeRequestForm extends BaseForm {

	@NotEmpty(message = "please enter change code")
	private String changeCode;

	@NotEmpty(message = "please enter title")
	private String title;

	@NotEmpty(message = "please enter request by")
	private String requestedBy;

	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {

		ChangeRequestDTO dto =initDTO(new ChangeRequestDTO());
		dto.setChangeCode(changeCode);
		dto.setTitle(title);
		dto.setRequestedBy(requestedBy);
		dto.setStatus(status);
		return dto;
	}
}
