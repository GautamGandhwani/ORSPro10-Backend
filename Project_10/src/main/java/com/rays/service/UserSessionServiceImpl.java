package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.UserSessionDAOInt;
import com.rays.dto.UserSessionDTO;

@Service
@Transactional
public class UserSessionServiceImpl extends BaseServiceImpl<UserSessionDTO, UserSessionDAOInt> implements UserSessionServiceInt{
	
}

