package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.TimeZoneDTO;
import com.rays.form.TimeZoneForm;
import com.rays.service.TimeZoneServiceInt;

@RestController
@RequestMapping(value = "Timezone")
public class TimeZoneCtl extends BaseCtl<TimeZoneForm, TimeZoneDTO, TimeZoneServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");

		res.addResult("timezonelist", map);
		return res;
	}
}