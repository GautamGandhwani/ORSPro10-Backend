package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RideSharingDAOInt;
import com.rays.dto.RideSharingDTO;

@Service
@Transactional
public class RideSharingServiceImpl extends BaseServiceImpl<RideSharingDTO, RideSharingDAOInt> implements RideSharingServiceInt{

}
