package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PHOTOGRAPHY")
public class PhotographyDTO extends BaseDTO{

	@Column(name = "CLIENT_NAME", length = 50)
	private String clientName;
	
	@Column(name = "EVENT_NAME", length = 50)
	private String eventType;
	
	@Column(name = "BOOKING_DATE")
	private Date bookingDate;
	
	@Column(name = "PHOTOGRAPHER_NAME", length = 50)
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
	public String getValue() {
		return clientName;
	}

	@Override
	public String getUniqueKey() {
		return "clientName";
	}

	@Override
	public String getUniqueValue() {
		return clientName;
	}

	@Override
	public String getLabel() {
		return "Photography";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("clientName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("clientName", clientName);
		return map;
	}
}