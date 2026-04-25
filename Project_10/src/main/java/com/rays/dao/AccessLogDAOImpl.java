package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AccessLogDTO;

@Repository
public class AccessLogDAOImpl extends BaseDAOImpl<AccessLogDTO> implements AccessLogDAOInt{

	@Override
	protected List<Predicate> getWhereClause(AccessLogDTO dto, CriteriaBuilder builder, Root<AccessLogDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<AccessLogDTO> getDTOClass() {
		return AccessLogDTO.class;
	}

}
