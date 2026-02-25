package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ComplaintDTO;

public class ComplaintForm extends BaseForm{

	@NotEmpty(message = "please enter complaint code")
	private String complaintCode;

	@NotEmpty(message = "please enter complaint title")
	private String complaintTitle;

	@NotEmpty(message = "please enter raised by")
	private String raisedBy;

	@NotEmpty(message = "please enter complaint status")
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
	public BaseDTO getDto() {
		
		ComplaintDTO  dto =initDTO(new ComplaintDTO());
		dto.setComplaintCode(complaintCode);
		dto.setComplaintTitle(complaintTitle);
		dto.setRaisedBy(raisedBy);
		dto.setComplaintStatus(complaintStatus);
		return dto;
	}
}