package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LoanNoteDTO;

public class LoanNoteForm extends BaseForm {

	@NotEmpty(message = "please enter lender name")
	private String lenderName;

	@NotNull(message = "please enter loan amount")
	private Integer loanAmount;

	@NotNull(message = "please enter interest rate")
	private Integer interestRate;

	@NotNull(message = "please enter maturity date")
	private Date maturityDate;

	public String getLenderName() {
		return lenderName;
	}

	public void setLenderName(String lenderName) {
		this.lenderName = lenderName;
	}

	public Integer getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	@Override
	public BaseDTO getDto() {

		LoanNoteDTO dto = initDTO(new LoanNoteDTO());
		dto.setLenderName(lenderName);
		dto.setLoanAmount(loanAmount);
		dto.setInterestRate(interestRate);
		dto.setMaturityDate(maturityDate);
		return dto;
	}
}