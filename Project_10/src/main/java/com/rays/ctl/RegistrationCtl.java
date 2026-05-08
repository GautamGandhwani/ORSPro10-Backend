package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.RegistrationDTO;
import com.rays.form.RegistrationForm;
import com.rays.service.RegistrationServiceInt;

@RestController
@RequestMapping(value = "Registration")
public class RegistrationCtl extends BaseCtl<RegistrationForm, RegistrationDTO, RegistrationServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Pending");
		map.put(3, "Inactive");

		res.addResult("registrationlist", map);
		return res;
	}
}
