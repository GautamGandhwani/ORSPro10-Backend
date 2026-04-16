package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.EncryptionDTO;

public class EncryptionForm extends BaseForm{

	@NotEmpty(message = "please enter encryption code")
	private String encryptionCode;

	@NotEmpty(message = "please enter algorithm")
    private String algorithm;

	@NotNull(message = "please enter key length")
    private Integer keyLength;

	@NotNull(message = "please enter status")
    private String status;

	public String getEncryptionCode() {
		return encryptionCode;
	}

	public void setEncryptionCode(String encryptionCode) {
		this.encryptionCode = encryptionCode;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public Integer getKeyLength() {
		return keyLength;
	}

	public void setKeyLength(Integer keyLength) {
		this.keyLength = keyLength;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		EncryptionDTO dto = initDTO(new EncryptionDTO());
		dto.setEncryptionCode(encryptionCode);
		dto.setAlgorithm(algorithm);
		dto.setKeyLength(keyLength);
		dto.setStatus(status);
		return dto;
	}
}
