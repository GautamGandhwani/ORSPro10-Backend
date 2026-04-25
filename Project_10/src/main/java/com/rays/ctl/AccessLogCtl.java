package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.AccessLogDTO;
import com.rays.form.AccessLogForm;
import com.rays.service.AccessLogServiceInt;

@RestController
@RequestMapping(value = "Accesslog")
public class AccessLogCtl extends BaseCtl<AccessLogForm, AccessLogDTO, AccessLogServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Success");
		map.put(2, "Failed");

		res.addResult("accessloglist", map);
		return res;
	}
}
