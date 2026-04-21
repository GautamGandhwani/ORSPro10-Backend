package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.APIKeyDTO;
import com.rays.form.APIKeyForm;
import com.rays.service.APIKeyServiceInt;

@RestController
@RequestMapping(value = "Apikey")
public class APIKeyCtl extends BaseCtl<APIKeyForm, APIKeyDTO, APIKeyServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");
		
		res.addResult("apikeylist", map);
		return res;
	}
}
