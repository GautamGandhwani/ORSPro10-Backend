package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GenderDAOInt;
import com.rays.dto.GenderDTO;

@Service
@Transactional
public class GenderServiceImpl extends BaseServiceImpl<GenderDTO, GenderDAOInt> implements GenderServiseInt{

}
