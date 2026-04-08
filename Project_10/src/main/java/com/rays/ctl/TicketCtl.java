package com.rays.ctl;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.TicketDTO;
import com.rays.form.TicketForm;
import com.rays.service.TicketServiceInt;

@RestController
@RequestMapping(value = "Ticket")
public class TicketCtl extends BaseCtl<TicketForm, TicketDTO, TicketServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
}