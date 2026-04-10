package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_RIDESHARING")
public class RideSharingDTO extends BaseDTO{

	@Column(name = "DRIVER_NAME", length = 50)
	private String driverName;
	
	@Column(name = "VEHICLE_TYPE", length = 50)
	private String vehicleType;
	
	@Column(name = "RIDE_DISTANCE", length = 50)
	private String rideDistance;
	
	@Column(name = "FARE_AMOUNT")
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
	public String getValue() {
		return driverName;
	}

	@Override
	public String getUniqueKey() {
		return "driverName";
	}

	@Override
	public String getUniqueValue() {
		return driverName;
	}

	@Override
	public String getLabel() {
		return "RideSharing";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("driverName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("driverName", driverName);
		return map;
	}
}
