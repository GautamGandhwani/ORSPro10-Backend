package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.LoanNoteDTO;
import com.rays.form.LoanNoteForm;
import com.rays.service.LoanNoteServiceInt;

@RestController
@RequestMapping(value = "Loannote")
public class LoanNoteCtl extends BaseCtl<LoanNoteForm, LoanNoteDTO, LoanNoteServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		
		return res;
	}
}
