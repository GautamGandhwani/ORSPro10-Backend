package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ArtifactDTO;

public class ArtifactForm extends BaseForm{

	@NotEmpty(message = "please enter artifact code")
	private String artifactCode;

	@NotEmpty(message = "please enter artifat name")
	private String artifactName;

	@NotEmpty(message = "please enter version")
	private String version;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getArtifactCode() {
		return artifactCode;
	}

	public void setArtifactCode(String artifactCode) {
		this.artifactCode = artifactCode;
	}

	public String getArtifactName() {
		return artifactName;
	}

	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {

		ArtifactDTO dto = initDTO(new ArtifactDTO());
		dto.setArtifactCode(artifactCode);
		dto.setArtifactName(artifactName);
		dto.setVersion(version);
		dto.setStatus(status);
		return dto;
	}
}
