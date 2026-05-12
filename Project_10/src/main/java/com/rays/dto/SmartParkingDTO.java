package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SMARTPARKING")
public class SmartParkingDTO extends BaseDTO{

	@Column(name = "PARKING_ZONE", length = 50)
	private String parkingZone;
	
	@Column(name = "OCCUPANCY_RATE", length = 50)
	private String occupancyRate;
	
	@Column(name = "PERDICTION_TIME")
	private Date predictionTime;
	
	@Column(name = "AVAILABLE_SLOTS", length = 50)
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
	public String getValue() {
		return parkingZone;
	}

	@Override
	public String getUniqueKey() {
		return "parkingZone";
	}

	@Override
	public String getUniqueValue() {
		return parkingZone;
	}

	@Override
	public String getLabel() {
		return "Smart Parking";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("parkingZone", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("parkingZone", parkingZone);
		return map;
	}
}
