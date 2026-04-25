package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_NOTIFICATIONRULE")
public class NotificationRuleDTO extends BaseDTO{

	@Column(name = "RULE_CODE", length = 50)
	private String ruleCode;
	
	@Column(name = "EVENT", length = 50)
	private String event;
	
	@Column(name = "TRIGGER_TYPE", length = 50)
	private String triggerType;
	
	@Column(name = "STATUS", length = 50)
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
	public String getValue() {
		return ruleCode;
	}

	@Override
	public String getUniqueKey() {
		return "ruleCode";
	}

	@Override
	public String getUniqueValue() {
		return ruleCode;
	}

	@Override
	public String getLabel() {
		return "Notification Rule";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("ruleCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("ruleCode", ruleCode);
		return map;
	}
}
