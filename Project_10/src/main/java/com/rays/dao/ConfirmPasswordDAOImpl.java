package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ConfirmPasswordDTO;

@Repository
public class ConfirmPasswordDAOImpl extends BaseDAOImpl<ConfirmPasswordDTO> implements ConfirmPasswordDAOInt{

	@Override
	protected List<Predicate> getWhereClause(ConfirmPasswordDTO dto, CriteriaBuilder builder,
			Root<ConfirmPasswordDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		
		if (!isEmptyString(dto.getConfirmValue())) {
			whereCondition.add(builder.like(qRoot.get("confirmValue"), dto.getConfirmValue() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<ConfirmPasswordDTO> getDTOClass() {
		return ConfirmPasswordDTO.class;
	}
}