package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InsuranceDTO;

public class InsuranceForm extends BaseForm {

	@NotEmpty(message = "please enter policy number")
	private String policyNumber;

	@NotNull(message = "please enter premium amount")
	private Double premiumAmount;

	@NotNull(message = "please enter expiry date")
	private Date expiryDate;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public BaseDTO getDto() {

		InsuranceDTO dto = initDTO(new InsuranceDTO());
		dto.setPolicyNumber(policyNumber);
		dto.setPremiumAmount(premiumAmount);
		dto.setExpiryDate(expiryDate);
		return dto;
	}
}