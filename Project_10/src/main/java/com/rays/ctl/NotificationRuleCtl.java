package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.NotificationRuleDTO;
import com.rays.form.NotificationRuleForm;
import com.rays.service.NotificationRuleServiceInt;

@RestController
@RequestMapping(value = "Notificationrule")
public class NotificationRuleCtl extends BaseCtl<NotificationRuleForm, NotificationRuleDTO, NotificationRuleServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");

		res.addResult("notificationrulelist", map);
		return res;
	}
}