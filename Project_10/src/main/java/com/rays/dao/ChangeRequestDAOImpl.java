package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ChangeRequestDTO;

@Repository
public class ChangeRequestDAOImpl extends BaseDAOImpl<ChangeRequestDTO> implements ChangeRequestDAOInt{

	@Override
	protected List<Predicate> getWhereClause(ChangeRequestDTO dto, CriteriaBuilder builder,
			Root<ChangeRequestDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getChangeCode())) {
			whereCondition.add(builder.like(qRoot.get("changeCode"), dto.getChangeCode() + "%"));
		}
		
		if (!isEmptyString(dto.getTitle())) {
			whereCondition.add(builder.like(qRoot.get("title"), dto.getTitle() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<ChangeRequestDTO> getDTOClass() {
		return ChangeRequestDTO.class;
	}

}
