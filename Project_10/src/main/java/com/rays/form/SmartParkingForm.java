package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SmartParkingDTO;

public class SmartParkingForm extends BaseForm {

	@NotEmpty(message = "please enter parking zone")
	private String parkingZone;

	@NotEmpty(message = "please enter occupancy rate")
	private String occupancyRate;

	@NotNull(message = "please enter perdiction time")
	private Date predictionTime;

	@NotEmpty(message = "please enter available slots")
	private String availableSlots;

	public String getParkingZone() {
		return parkingZone;
	}

	public void setParkingZone(String parkingZone) {
		this.parkingZone = parkingZone;
	}

	public String getOccupancyRate() {
		return occupancyRate;
	}

	public void setOccupancyRate(String occupancyRate) {
		this.occupancyRate = occupancyRate;
	}

	public Date getPredictionTime() {
		return predictionTime;
	}

	public void setPredictionTime(Date predictionTime) {
		this.predictionTime = predictionTime;
	}

	public String getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(String availableSlots) {
		this.availableSlots = availableSlots;
	}
	
	@Override
	public BaseDTO getDto() {

		SmartParkingDTO dto = initDTO(new SmartParkingDTO());
		dto.setParkingZone(parkingZone);
		dto.setOccupancyRate(occupancyRate);
		dto.setPredictionTime(predictionTime);
		dto.setAvailableSlots(availableSlots);
		return dto;
		
	}
}