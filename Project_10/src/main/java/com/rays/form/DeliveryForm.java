package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DeliveryDTO;

public class DeliveryForm extends BaseForm{

	@NotEmpty(message = "please enter delivery code")
	private String deliveryCode;

	@NotEmpty(message = "please enter delivery address")
	private String deliveryAddress;
	
	@NotNull(message = "please enter delivery date")
	private LocalDate deliveryDate;
	
	@NotEmpty(message = "please enter delivery status")
	private String deliveryStatus;

	public String getDeliveryCode() {
		return deliveryCode;
	}

	public void setDeliveryCode(String deliveryCode) {
		this.deliveryCode = deliveryCode;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	@Override
	public BaseDTO getDto() {

		DeliveryDTO dto = initDTO(new DeliveryDTO());
		dto.setDeliveryCode(deliveryCode);
		dto.setDeliveryAddress(deliveryAddress);
		dto.setDeliveryDate(deliveryDate);
		dto.setDeliveryStatus(deliveryStatus);
		return dto;
	}
}
