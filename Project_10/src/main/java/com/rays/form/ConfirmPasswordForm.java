package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ConfirmPasswordDTO;

public class ConfirmPasswordForm extends BaseForm{

	@NotEmpty(message = "please enter confirm password")
	private String confirmCode;

	@NotEmpty(message = "please enter user name")
	private String userName;

	@NotEmpty(message = "please enter confirm value")
	private String confirmValue;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getConfirmCode() {
		return confirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getConfirmValue() {
		return confirmValue;
	}

	public void setConfirmValue(String confirmValue) {
		this.confirmValue = confirmValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		ConfirmPasswordDTO dto = initDTO(new ConfirmPasswordDTO());
		dto.setConfirmCode(confirmCode);
		dto.setUserName(userName);
		dto.setConfirmValue(confirmValue);
		dto.setStatus(status);
		return dto;
	}
}
