package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.AppointmentDTO;
import com.rays.form.AppointmentForm;
import com.rays.service.AppointmentServiceInt;

@RestController
@RequestMapping(value = "Appointment")
public class AppointmentCtl extends BaseCtl<AppointmentForm, AppointmentDTO, AppointmentServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Confirmed");
		map.put(2, "Pending");
		map.put(3, "Cancelled");

		res.addResult("appointmentlist", map);
		return res;
	}
}