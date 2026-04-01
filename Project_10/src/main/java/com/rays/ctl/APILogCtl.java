package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.APILogDTO;
import com.rays.form.APILogForm;
import com.rays.service.APILogServiceInt;

@RestController
@RequestMapping(value = "APILog")
public class APILogCtl extends BaseCtl<APILogForm, APILogDTO, APILogServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "200 OK");
		map.put(2, "201 Created");
		map.put(3, "202 Accepted");
		map.put(4, "401 Unauthorized");
		map.put(5, "404 Not Found");
		map.put(6, "500 Internal Server Error");
		map.put(7, "503 Service Unavailable");
		
		res.addResult("apiloglist", map);
		return res;
	}
}
