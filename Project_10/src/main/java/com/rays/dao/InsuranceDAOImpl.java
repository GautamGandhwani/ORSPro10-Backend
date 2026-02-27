package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InsuranceDTO;

@Repository
public class InsuranceDAOImpl extends BaseDAOImpl<InsuranceDTO> implements InsuranceDAOInt {

	@Override
	protected List<Predicate> getWhereClause(InsuranceDTO dto, CriteriaBuilder builder, Root<InsuranceDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPolicyNumber())) {
			whereCondition.add(builder.like(qRoot.get("policyNumber"), dto.getPolicyNumber() + "%"));
		}

		if (!isZeroNumber(dto.getPremiumAmount())) {
			whereCondition.add(builder.equal(qRoot.get("premiumAmount"), dto.getPremiumAmount()));
		}

		if (isNotNull(dto.getExpiryDate())) {
			whereCondition.add(builder.equal(qRoot.get("expiryDate"), dto.getExpiryDate()));
		}
		return whereCondition;
	}

	@Override
	public Class<InsuranceDTO> getDTOClass() {
		return InsuranceDTO.class;
	}
}