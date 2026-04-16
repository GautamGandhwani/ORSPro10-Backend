package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AppointmentDAOInt;
import com.rays.dto.AppointmentDTO;

@Service
@Transactional
public class AppointmentServiceImpl extends BaseServiceImpl<AppointmentDTO, AppointmentDAOInt> implements AppointmentServiceInt{

}
