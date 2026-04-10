package com.rays.form;


import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LanguageDTO;

public class LanguageForm extends BaseForm{

	@NotEmpty(message = "please enter language code")
	private String languageCode;

	@NotEmpty(message = "please enter language name")
	private String languageName;

	@NotEmpty(message = "please enter resion")
	private String resion;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getResion() {
		return resion;
	}

	public void setResion(String resion) {
		this.resion = resion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		LanguageDTO dto = initDTO(new LanguageDTO());
		dto.setLanguageCode(languageCode);
		dto.setLanguageName(languageName);
		dto.setResion(resion);
		dto.setStatus(status);
		return dto;
	}
}
