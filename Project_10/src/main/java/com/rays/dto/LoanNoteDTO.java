package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LOAN")
public class LoanNoteDTO extends BaseDTO {

	@Column(name = "LENDER_NAME", length = 50)
	private String lenderName;

	@Column(name = "LOAN_AMOUNT")
	private Integer loanAmount;

	@Column(name = "INTEREST_RATE")
	private Integer interestRate;

	@Column(name = "MATURITY_DATE")
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
	public String getValue() {
		return lenderName;
	}

	@Override
	public String getUniqueKey() {
		return "lenderName";
	}

	@Override
	public String getUniqueValue() {
		return lenderName;
	}

	@Override
	public String getLabel() {
		return "Loan Note";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("lenderName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("lenderName", lenderName);
		return map;
	}
}
