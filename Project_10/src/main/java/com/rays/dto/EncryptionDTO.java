package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ENCRYPTION")
public class EncryptionDTO extends BaseDTO{

	@Column(name = "ENCRYPTION_CODE", length = 50)
	private String encryptionCode;

	@Column(name = "ALGORITHM", length = 50)
    private String algorithm;

	@Column(name = "KEY_LENGTH")
    private Integer keyLength;

	@Column(name = "STATUS", length = 50)
    private String status;

	public String getEncryptionCode() {
		return encryptionCode;
	}

	public void setEncryptionCode(String encryptionCode) {
		this.encryptionCode = encryptionCode;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public Integer getKeyLength() {
		return keyLength;
	}

	public void setKeyLength(Integer keyLength) {
		this.keyLength = keyLength;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return encryptionCode;
	}

	@Override
	public String getUniqueKey() {
		return "encryptionCode";
	}

	@Override
	public String getUniqueValue() {
		return encryptionCode;
	}

	@Override
	public String getLabel() {
		return "Encryption";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("encryptionCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("encryptionCode", encryptionCode);
		return map;
	}
}
