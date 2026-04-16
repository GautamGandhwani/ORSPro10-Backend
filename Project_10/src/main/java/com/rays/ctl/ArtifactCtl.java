package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ArtifactDTO;
import com.rays.form.ArtifactForm;
import com.rays.service.ArtifactServiceInt;

@RestController
@RequestMapping(value = "Artifact")
public class ArtifactCtl extends BaseCtl<ArtifactForm, ArtifactDTO, ArtifactServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");

		res.addResult("artifactlist", map);
		return res;
	}
}
