package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ARTIFACT")
public class ArtifactDTO extends BaseDTO{

	@Column(name = "ARTIFACT_CODE", length = 50)
	private String artifactCode;
	
	@Column(name = "ARTIFACT_NAME", length = 50)
	private String artifactName;
	
	@Column(name = "VERSION", length = 50)
	private String version;
	
	@Column(name = "STATUS", length = 50)
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
	public String getValue() {
		return artifactCode;
	}

	@Override
	public String getUniqueKey() {
		return "artifactCode";
	}

	@Override
	public String getUniqueValue() {
		return artifactCode;
	}

	@Override
	public String getLabel() {
		return "Artifact";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("artifactCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("artifactCode", artifactCode);
		return map;
	}	
}