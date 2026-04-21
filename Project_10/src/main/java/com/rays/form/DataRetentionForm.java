package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DataRetentionDTO;

public class DataRetentionForm extends BaseForm {

	@NotEmpty(message = "please enter retention code")
	private String retentionCode;

	@NotEmpty(message = "please enter retention type")
	private String retentionType;

	@NotNull(message = "please enter duration")
	private Integer duration;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getRetentionCode() {
		return retentionCode;
	}

	public void setRetentionCode(String retentionCode) {
		this.retentionCode = retentionCode;
	}

	public String getRetentionType() {
		return retentionType;
	}

	public void setRetentionType(String retentionType) {
		this.retentionType = retentionType;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		DataRetentionDTO dto = initDTO(new DataRetentionDTO());
		dto.setRetentionCode(retentionCode);
		dto.setRetentionType(retentionType);
		dto.setDuration(duration);
		dto.setStatus(status);
		return dto;
	}
}
