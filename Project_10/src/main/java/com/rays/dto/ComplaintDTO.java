package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_COMPLAINT")
public class ComplaintDTO extends BaseDTO {

	@Column(name = "COMPLAINT_CODE", length = 50)
	private String complaintCode;

	@Column(name = "COMPLAINT_TITLE", length = 50)
	private String complaintTitle;

	@Column(name = "RAISED_BY", length = 50)
	private String raisedBy;

	@Column(name = "COMPLAINT_STATUS", length = 50)
	private String complaintStatus;

	public String getComplaintCode() {
		return complaintCode;
	}

	public void setComplaintCode(String complaintCode) {
		this.complaintCode = complaintCode;
	}

	public String getComplaintTitle() {
		return complaintTitle;
	}

	public void setComplaintTitle(String complaintTitle) {
		this.complaintTitle = complaintTitle;
	}

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	@Override
	public String getValue() {
		return complaintCode;
	}

	@Override
	public String getUniqueKey() {
		return "complaintCode";
	}

	@Override
	public String getUniqueValue() {
		return complaintCode;
	}

	@Override
	public String getLabel() {
		return "Complaint";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("complaintCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("complaintCode", complaintCode);
		return map;
	}

}
