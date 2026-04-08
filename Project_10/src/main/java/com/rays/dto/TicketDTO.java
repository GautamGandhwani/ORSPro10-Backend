package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_TICKET")
public class TicketDTO extends BaseDTO{

	@Column(name = "CATEGORY_NAME", length = 50)
	private String categoryName;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "AVILABLE_SEATS")
	private Integer availableSeats;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String getValue() {
		return "categoryName";
	}

	@Override
	public String getUniqueKey() {
		return "categoryName";
	}

	@Override
	public String getUniqueValue() {
		return categoryName;
	}

	@Override
	public String getLabel() {
		return "Ticket";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("categoryName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("categoryName", categoryName);
		return map;
	}
}