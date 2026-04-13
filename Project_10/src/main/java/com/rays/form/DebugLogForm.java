package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DebugLogDTO;

public class DebugLogForm extends BaseForm {

	@NotEmpty(message = "please enter debug code")
	private String debugCode;

	@NotEmpty(message = "please enter message")
	private String message;

	@NotEmpty(message = "please enter log level")
	private String logLevel;

	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {
		
		DebugLogDTO dto = initDTO(new DebugLogDTO());
		dto.setDebugCode(debugCode);
		dto.setMessage(message);
		dto.setLogLevel(logLevel);
		dto.setStatus(status);
		return dto;
	}
}