package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DebugLogDAOInt;
import com.rays.dto.DebugLogDTO;

@Service
@Transactional
public class DebugLogServiceImpl extends BaseServiceImpl<DebugLogDTO, DebugLogDAOInt> implements DebugLogServiceInt{

}
