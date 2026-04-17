package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.BillingDTO;
import com.rays.form.BillingForm;
import com.rays.service.BillingServiceInt;

@RestController
@RequestMapping(value = "Billing")
public class BillingCtl extends BaseCtl<BillingForm, BillingDTO, BillingServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Paid");
		map.put(2, "Pending");
		map.put(3, "Failed");

		res.addResult("billinglist", map);
		return res;
	}
}
