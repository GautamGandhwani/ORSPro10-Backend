package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BillingDTO;

public class BillingForm extends BaseForm {

	@NotEmpty(message = "please enter billing code")
	private String billingCode;

	@NotEmpty(message = "please enter user name")
	private String userName;

	@NotNull(message = "please enter amount")
	private Integer amount;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getBillingCode() {
		return billingCode;
	}

	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		BillingDTO dto = initDTO(new BillingDTO());
		dto.setBillingCode(billingCode);
		dto.setUserName(userName);
		dto.setAmount(amount);dto.setStatus(status);
		return dto;
	}
}
