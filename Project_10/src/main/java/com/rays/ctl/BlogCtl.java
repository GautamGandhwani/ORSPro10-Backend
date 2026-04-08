package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.BlogDTO;
import com.rays.form.BlogForm;
import com.rays.service.BlogServiceInt;

@RestController
@RequestMapping(value = "Blog")
public class BlogCtl extends BaseCtl<BlogForm, BlogDTO, BlogServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Published");
		map.put(2, "Draft");
		map.put(3, "Pending");

		res.addResult("bloglist", map);
		return res;
	}
}