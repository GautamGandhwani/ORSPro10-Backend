package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.EncryptionDAOInt;
import com.rays.dto.EncryptionDTO;

@Service
@Transactional
public class EncryptionServiceImpl extends BaseServiceImpl<EncryptionDTO, EncryptionDAOInt> implements EncryptionServiceInt{

}
