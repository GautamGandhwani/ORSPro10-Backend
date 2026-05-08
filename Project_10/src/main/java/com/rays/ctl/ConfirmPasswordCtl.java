package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ConfirmPasswordDTO;
import com.rays.form.ConfirmPasswordForm;
import com.rays.service.ConfirmPasswordServiceInt;

@RestController
@RequestMapping(value = "Confirmpassword")
public class ConfirmPasswordCtl extends BaseCtl<ConfirmPasswordForm, ConfirmPasswordDTO, ConfirmPasswordServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Confirmed");
		map.put(2, "Pending");
		map.put(3, "Failed");

		res.addResult("confirmpasswordlist", map);
		return res;
	}
}
