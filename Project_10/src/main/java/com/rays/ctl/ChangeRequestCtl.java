package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ChangeRequestDTO;
import com.rays.form.ChangeRequestForm;
import com.rays.service.ChangeRequestServiceInt;

@RestController
@RequestMapping(value = "Changerequest")
public class ChangeRequestCtl extends BaseCtl<ChangeRequestForm, ChangeRequestDTO, ChangeRequestServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Approved");
		map.put(2, "In Progress");
		map.put(3, "Pending");

		res.addResult("changerequsetlist", map);
		return res;
	}
}