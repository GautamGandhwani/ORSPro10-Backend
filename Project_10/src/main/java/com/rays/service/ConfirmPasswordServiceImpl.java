package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ConfirmPasswordDAOInt;
import com.rays.dto.ConfirmPasswordDTO;

@Service
@Transactional
public class ConfirmPasswordServiceImpl extends BaseServiceImpl<ConfirmPasswordDTO, ConfirmPasswordDAOInt> implements ConfirmPasswordServiceInt{

}
