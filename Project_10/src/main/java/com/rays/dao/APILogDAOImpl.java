package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.APILogDTO;

@Repository
public class APILogDAOImpl extends BaseDAOImpl<APILogDTO> implements APILogDAOInt{

	@Override
	protected List<Predicate> getWhereClause(APILogDTO dto, CriteriaBuilder builder, Root<APILogDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getApiName())) {

			whereCondition.add(builder.like(qRoot.get("apiName"), dto.getApiName() + "%"));
		}

		if (!isEmptyString(dto.getResponseStatus())) {

			whereCondition.add(builder.like(qRoot.get("apiStatus"), dto.getResponseStatus() + "%"));
		}
		
		if (isNotNull(dto.getRequestTime())) {
			whereCondition.add(builder.equal(qRoot.get("requestTime"), dto.getRequestTime()));
		}

		return whereCondition;
	}

	@Override
	public Class<APILogDTO> getDTOClass() {
		return APILogDTO.class;
	}
}