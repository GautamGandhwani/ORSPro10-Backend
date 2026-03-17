package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DeliveryDAOInt;
import com.rays.dto.DeliveryDTO;

@Service
@Transactional
public class DeliveryServiceImpl extends BaseServiceImpl<DeliveryDTO, DeliveryDAOInt> implements DeliveryServiceInt{

}
