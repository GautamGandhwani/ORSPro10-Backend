package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RegistrationDTO;

@Repository
public class RegistrationDAOImpl extends BaseDAOImpl<RegistrationDTO> implements RegistrationDAOInt {

	@Override
	protected List<Predicate> getWhereClause(RegistrationDTO dto, CriteriaBuilder builder,
			Root<RegistrationDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getFirstName())) {
			whereCondition.add(builder.like(qRoot.get("firstName"), dto.getFirstName() + "%"));
		}

		if (!isEmptyString(dto.getLastName())) {
			whereCondition.add(builder.like(qRoot.get("lastName"), dto.getLastName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<RegistrationDTO> getDTOClass() {
		return RegistrationDTO.class;
	}

}