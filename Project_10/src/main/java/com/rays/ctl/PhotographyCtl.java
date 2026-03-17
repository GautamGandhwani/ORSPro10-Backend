package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PhotographyDTO;
import com.rays.form.PhotographyForm;
import com.rays.service.PhotographyServiceInt;

@RestController
@RequestMapping(value = "Photography")
public class PhotographyCtl extends BaseCtl<PhotographyForm, PhotographyDTO, PhotographyServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		return res;
	}
}