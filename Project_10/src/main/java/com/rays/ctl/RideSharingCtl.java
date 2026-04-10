package com.rays.ctl;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.RideSharingDTO;
import com.rays.form.RideSharingForm;
import com.rays.service.RideSharingServiceInt;

@RestController
@RequestMapping(value = "Ridesharing")
public class RideSharingCtl extends BaseCtl<RideSharingForm, RideSharingDTO, RideSharingServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
