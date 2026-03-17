package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dao.DepartmentDTO;
import com.rays.form.DepartmentForm;
import com.rays.service.DepartmentServiceInt;

@RestController
@RequestMapping(value = "Department")
public class DepartmentCtl extends BaseCtl<DepartmentForm, DepartmentDTO, DepartmentServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");

		res.addResult("departmentlist", map);
		return res;
	}
}