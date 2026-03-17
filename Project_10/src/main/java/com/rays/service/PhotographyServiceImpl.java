package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PhotographyDAOInt;
import com.rays.dto.PhotographyDTO;

@Service
@Transactional
public class PhotographyServiceImpl extends BaseServiceImpl<PhotographyDTO, PhotographyDAOInt> implements PhotographyServiceInt{

}