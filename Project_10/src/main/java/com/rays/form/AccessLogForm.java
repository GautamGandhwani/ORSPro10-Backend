package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AccessLogDTO;

public class AccessLogForm extends BaseForm {

	@NotEmpty(message = "please enter accesslog code")
	private String accessLogCode;

	@NotEmpty(message = "please enter user name")
	private String userName;

	@NotNull(message = "please enter access time")
	private Date accessTime;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getAccessLogCode() {
		return accessLogCode;
	}

	public void setAccessLogCode(String accessLogCode) {
		this.accessLogCode = accessLogCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		AccessLogDTO dto = initDTO(new AccessLogDTO());
		dto.setAccessLogCode(accessLogCode);
		dto.setUserName(userName);
		dto.setAccessTime(accessTime);
		dto.setStatus(status);
		return dto;
	}
}