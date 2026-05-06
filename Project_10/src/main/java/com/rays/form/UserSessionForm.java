package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.UserSessionDTO;

public class UserSessionForm extends BaseForm{

	@NotEmpty(message = "please enter session code")
	private String sessionCode;

	@NotEmpty(message = "please enter user name")
	private String userName;

	@NotNull(message = "please enter login time")
	private Date loginTime;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getSessionCode() {
		return sessionCode;
	}

	public void setSessionCode(String sessionCode) {
		this.sessionCode = sessionCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		UserSessionDTO dto = initDTO(new UserSessionDTO());
		dto.setSessionCode(sessionCode);
		dto.setUserName(userName);
		dto.setLoginTime(loginTime);
		dto.setStatus(status);
		return dto;
	}
}