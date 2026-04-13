package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.DebugLogDTO;
import com.rays.form.DebugLogForm;
import com.rays.service.DebugLogServiceInt;

@RestController
@RequestMapping(value = "Debuglog")
public class DebugLogCtl extends BaseCtl<DebugLogForm, DebugLogDTO, DebugLogServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Activ");
		map.put(2, "Inactive");

		res.addResult("debugloglist", map);
		return res;
	}
}