package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DataRetentionDAOInt;
import com.rays.dto.DataRetentionDTO;

@Service
@Transactional
public class DataRetentionServiceImpl extends BaseServiceImpl< DataRetentionDTO, DataRetentionDAOInt> implements DataRetentionServiceInt{

}
