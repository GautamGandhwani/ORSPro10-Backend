package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.APILogDTO;

public class APILogForm extends BaseForm {

	@NotEmpty(message = "please enter api code")
	private String apiCode;

	@NotEmpty(message = "please enter api name")
	private String apiName;

	@NotNull(message = "please enter request time")
	private LocalDate requestTime;

	@NotEmpty(message = "please enter response status ")
	private String responseStatus;

	public String getApiCode() {
		return apiCode;
	}

	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public LocalDate getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(LocalDate requestTime) {
		this.requestTime = requestTime;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	@Override
	public BaseDTO getDto() {

		APILogDTO dto = initDTO(new APILogDTO());
		dto.setApiCode(apiCode);
		dto.setApiName(apiName);
		dto.setRequestTime(requestTime);
		dto.setResponseStatus(responseStatus);
		return dto;
	}
}