package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RegistrationDTO;

public class RegistrationForm extends BaseForm{

	@NotEmpty(message = "please enter registration code")
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	private String registrationCode;
	
	@NotEmpty(message = "please enter first name")
	private String firstName;
	
	@NotEmpty(message = "please enter last name")
	private String lastName;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getRegistrationCode() {
		return registrationCode;
	}

	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		RegistrationDTO dto = initDTO(new RegistrationDTO());
		dto.setRegistrationCode(registrationCode);
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setStatus(status);
		return dto;
	}
}