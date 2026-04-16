package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_APPOINTMENT")
public class AppointmentDTO extends BaseDTO{

	@Column(name = "PATIENT_NAME", length = 50)
	private String patientName;
	
	@Column(name = "APPOINTMENT_DATE")
	private Date appointmentDate;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return patientName;
	}

	@Override
	public String getUniqueKey() {
		return "patientName";
	}

	@Override
	public String getUniqueValue() {
		return patientName;
	}

	@Override
	public String getLabel() {
		return "Appointment";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("patientName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("patientName", patientName);
		return map;
	}
}