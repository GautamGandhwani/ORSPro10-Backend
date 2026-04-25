package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ChangeRequestDAOInt;
import com.rays.dto.ChangeRequestDTO;

@Service
@Transactional
public class ChangeRequestServiceImpl extends BaseServiceImpl<ChangeRequestDTO, ChangeRequestDAOInt> implements ChangeRequestServiceInt{

}
