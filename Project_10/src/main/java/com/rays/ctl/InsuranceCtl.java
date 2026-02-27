package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.InsuranceDTO;
import com.rays.form.InsuranceForm;
import com.rays.service.InsuranceServiceInt;

@RestController
@RequestMapping(value = "Insurance")
public class InsuranceCtl extends BaseCtl<InsuranceForm, InsuranceDTO, InsuranceServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		return res;
	}
}
