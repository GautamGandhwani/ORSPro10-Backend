package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.EncryptionDTO;
import com.rays.form.EncryptionForm;
import com.rays.service.EncryptionServiceInt;

@RestController
@RequestMapping(value = "Encryption")
public class EncryptionCtl extends BaseCtl<EncryptionForm, EncryptionDTO, EncryptionServiceInt>{

}