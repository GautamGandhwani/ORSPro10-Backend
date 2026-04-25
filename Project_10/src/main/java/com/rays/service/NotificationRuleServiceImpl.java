package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.NotificationRuleDAOInt;
import com.rays.dto.NotificationRuleDTO;

@Service
@Transactional
public class NotificationRuleServiceImpl extends BaseServiceImpl<NotificationRuleDTO, NotificationRuleDAOInt> implements NotificationRuleServiceInt{
	
}