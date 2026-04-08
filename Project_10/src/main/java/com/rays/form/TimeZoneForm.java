package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TimeZoneDTO;

public class TimeZoneForm extends BaseForm {

	@NotEmpty(message = "please enter timezone code")
	private String timezoneCode;

	@NotEmpty(message = "please enter timezone name")
	private String timezoneName;

	@NotEmpty(message = "please enter offset")
	private String offset;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getTimezoneCode() {
		return timezoneCode;
	}

	public void setTimezoneCode(String timezoneCode) {
		this.timezoneCode = timezoneCode;
	}

	public String getTimezoneName() {
		return timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		TimeZoneDTO dto = initDTO(new TimeZoneDTO());
		dto.setTimezoneCode(timezoneCode);
		dto.setTimezoneName(timezoneName);
		dto.setOffset(offset);
		dto.setStatus(status);
		return dto;
	}
}
