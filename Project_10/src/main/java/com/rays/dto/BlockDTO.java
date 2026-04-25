package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_BLOCK")
public class BlockDTO extends BaseDTO{

	@Column(name = "BLOCK_CODE", length = 50)
	private String blockCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "REASOIN", length = 50)
	private String reason;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return blockCode;
	}

	@Override
	public String getUniqueKey() {
		return "blockCode";
	}

	@Override
	public String getUniqueValue() {
		return blockCode;
	}

	@Override
	public String getLabel() {
		return "Block";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("blockCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("blockCode", blockCode);
		return map;
	}
}
