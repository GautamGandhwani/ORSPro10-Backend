package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.BlockDTO;
import com.rays.form.BlockForm;
import com.rays.service.BlockServiceInt;

@RestController
@RequestMapping(value = "Block")
public class BlockCtl extends BaseCtl<BlockForm, BlockDTO, BlockServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Blocked");
		map.put(2, "Unblocked");

		res.addResult("blocklist", map);
		return res;
	}
}
