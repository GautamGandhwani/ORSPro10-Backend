package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BlockDTO;

public class BlockForm extends BaseForm{

	@NotEmpty(message = "please enter block code")
	private String blockCode;
	
	@NotEmpty(message = "please enter block name")
	private String userName;
	
	@NotEmpty(message = "please enter reasion")
	private String reason;
	
	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {

		BlockDTO dto = initDTO(new BlockDTO());
		dto.setBlockCode(blockCode);
		dto.setUserName(userName);
		dto.setReason(reason);
		dto.setStatus(status);
		return dto;
	}
}