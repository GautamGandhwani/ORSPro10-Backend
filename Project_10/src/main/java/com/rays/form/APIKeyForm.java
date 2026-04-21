package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.APIKeyDTO;

public class APIKeyForm extends BaseForm {

	@NotEmpty(message = "please enter apikey code")
	private String apiKeyCode;

	@NotEmpty(message = "please enter key value")
	private String keyValue;

	@NotEmpty(message = "please enter issued to")
	private String issuedTo;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getApiKeyCode() {
		return apiKeyCode;
	}

	public void setApiKeyCode(String apiKeyCode) {
		this.apiKeyCode = apiKeyCode;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		APIKeyDTO dto = initDTO(new APIKeyDTO());
		dto.setApiKeyCode(apiKeyCode);
		dto.setKeyValue(keyValue);
		dto.setIssuedTo(issuedTo);
		dto.setStatus(status);
		return dto;
	}
}