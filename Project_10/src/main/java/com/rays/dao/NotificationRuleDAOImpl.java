package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.NotificationRuleDTO;

@Repository
public class NotificationRuleDAOImpl extends BaseDAOImpl<NotificationRuleDTO> implements NotificationRuleDAOInt {

	@Override
	protected List<Predicate> getWhereClause(NotificationRuleDTO dto, CriteriaBuilder builder,
			Root<NotificationRuleDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getEvent())) {
			whereCondition.add(builder.like(qRoot.get("event"), dto.getEvent() + "%"));
		}

		if (!isEmptyString(dto.getTriggerType())) {
			whereCondition.add(builder.like(qRoot.get("triggerType"), dto.getTriggerType() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<NotificationRuleDTO> getDTOClass() {
		return NotificationRuleDTO.class;
	}

}
