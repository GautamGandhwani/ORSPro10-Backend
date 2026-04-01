package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.InvestorDTO;
import com.rays.form.InvestorForm;
import com.rays.service.InvestorServiceInt;

@RestController
@RequestMapping(value = "Investor")
public class InvestorCtl extends BaseCtl<InvestorForm, InvestorDTO, InvestorServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mutual Fund");
		map.put(2, "Stocks");
		map.put(3, "Fixed Deposit");
		map.put(4, "Real Estate");
		map.put(5, "Gold");
		map.put(6, "Cryptocurrency");
		map.put(7, "Bonds");
		map.put(8, "SIP");
		map.put(9, "ETF");
		map.put(10, "Insurance Plan");
		
		res.addResult("investorlist", map);
		return res;
	}
}