package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.LanguageDTO;
import com.rays.form.LanguageForm;
import com.rays.service.LanguageServiceInt;

@RestController
@RequestMapping(value = "Language")
public class LanguageCtl extends BaseCtl<LanguageForm, LanguageDTO, LanguageServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Activ");
		map.put(2, "Inactive");

		res.addResult("languagelist", map);
		return res;
	}
}
