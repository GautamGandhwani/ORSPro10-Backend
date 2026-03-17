package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PhotographyDTO;

public class PhotographyForm extends BaseForm{

	@NotEmpty(message = "please enter client name")
	private String clientName;
	
	@NotEmpty(message = "please enter event type")
	private String eventType;
	
	@NotNull(message = "please enter booking date")
	private Date bookingDate;
	
	@NotEmpty(message = "please enter first name")
	private String photographerName;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getPhotographerName() {
		return photographerName;
	}

	public void setPhotographerName(String photographerName) {
		this.photographerName = photographerName;
	}

	@Override
	public BaseDTO getDto() {

		PhotographyDTO dto = initDTO(new PhotographyDTO());
		dto.setClientName(clientName);
		dto.setEventType(eventType);
		dto.setBookingDate(bookingDate);
		dto.setPhotographerName(photographerName);
		return dto;
	}
}