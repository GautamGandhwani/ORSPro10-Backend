package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DebugLogDTO;

@Repository
public class DebugLogDAOImpl extends BaseDAOImpl<DebugLogDTO> implements DebugLogDAOInt{

	@Override
	protected List<Predicate> getWhereClause(DebugLogDTO dto, CriteriaBuilder builder, Root<DebugLogDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getMessage())) {
			whereCondition.add(builder.like(qRoot.get("message"), dto.getMessage() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<DebugLogDTO> getDTOClass() {
		return DebugLogDTO.class;
	}
}