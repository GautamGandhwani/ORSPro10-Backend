package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RideSharingDTO;

public class RideSharingForm extends BaseForm {

	@NotEmpty(message = "please enter driver name")
	private String driverName;

	@NotEmpty(message = "please enter vehicle type")
	private String vehicleType;

	@NotEmpty(message = "please enter ride distance")
	private String rideDistance;

	@NotNull(message = "please enter fare amount")
	private Integer fareAmount;

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getRideDistance() {
		return rideDistance;
	}

	public void setRideDistance(String rideDistance) {
		this.rideDistance = rideDistance;
	}

	public Integer getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(Integer fareAmount) {
		this.fareAmount = fareAmount;
	}

	@Override
	public BaseDTO getDto() {

		RideSharingDTO dto = initDTO(new RideSharingDTO());
		dto.setDriverName(driverName);
		dto.setVehicleType(vehicleType);
		dto.setRideDistance(rideDistance);
		dto.setFareAmount(fareAmount);
		return dto;
	}
}