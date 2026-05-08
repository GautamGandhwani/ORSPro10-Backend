package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RegistrationDAOInt;
import com.rays.dto.RegistrationDTO;

@Service
@Transactional
public class RegistrationServiceImpl extends BaseServiceImpl<RegistrationDTO, RegistrationDAOInt> implements RegistrationServiceInt{

}
