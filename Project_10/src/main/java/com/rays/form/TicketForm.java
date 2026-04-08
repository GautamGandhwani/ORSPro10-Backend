package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TicketDTO;

public class TicketForm extends BaseForm{

	@NotEmpty(message = "please enter category name")
	private String categoryName;
	
	@NotNull(message = "please enter price")
	private Double price;
	
	@NotNull(message = "please enter available seats")
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
	public BaseDTO getDto() {

		TicketDTO dto =initDTO(new TicketDTO());
		dto.setCategoryName(categoryName);
		dto.setPrice(price);
		dto.setAvailableSeats(availableSeats);
		return dto;
	}
}