package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BillingDAOInt;
import com.rays.dto.BillingDTO;

@Service
@Transactional
public class billingServiceImpl extends BaseServiceImpl<BillingDTO, BillingDAOInt> implements BillingServiceInt{

}
