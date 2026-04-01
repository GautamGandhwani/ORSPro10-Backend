package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_INVESTOR")
public class InvestorDTO extends BaseDTO{

	@Column(name = "INVESTOR_NAME", length = 50)
	private String investorName;
	
	@Column(name = "INVESTMENT_AMOUNT")
	private Double investmentAmount;
	
	@Column(name = "INVESTOR_TYPE", length = 50)
	private String investmentType;

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public Double getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(Double investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public String getInvestmentType() {
		return investmentType;
	}

	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}

	@Override
	public String getValue() {
		return investorName;
	}

	@Override
	public String getUniqueKey() {
		return "investorName";
	}

	@Override
	public String getUniqueValue() {
		return investorName;
	}

	@Override
	public String getLabel() {
		return "Investor";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("investorName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("investorName", investorName);
		return map;
	}
}
