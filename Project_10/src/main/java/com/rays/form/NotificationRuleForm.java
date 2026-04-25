package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.NotificationRuleDTO;

public class NotificationRuleForm extends BaseForm{

	@NotEmpty(message = "please enter rule code")
	private String ruleCode;

	@NotEmpty(message = "please enter event")
	private String event;

	@NotEmpty(message = "please enter trigger type")
	private String triggerType;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getRuleCode() {
		return ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		NotificationRuleDTO dto =initDTO(new NotificationRuleDTO());
		dto.setRuleCode(ruleCode);
		dto.setEvent(event);
		dto.setTriggerType(triggerType);
		dto.setStatus(status);
		return dto;
	}
}
