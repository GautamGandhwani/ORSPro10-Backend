package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DataRetentionDTO;

@Repository
public class DataRetentionDAOImpl extends BaseDAOImpl<DataRetentionDTO> implements DataRetentionDAOInt{

	@Override
	protected List<Predicate> getWhereClause(DataRetentionDTO dto, CriteriaBuilder builder, Root<DataRetentionDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getRetentionType())) {
			whereCondition.add(builder.like(qRoot.get("retentionType"), dto.getRetentionType() + "%"));
		}
		
		if (!isZeroNumber(dto.getDuration())) {
			whereCondition.add(builder.equal(qRoot.get("duration"), dto.getDuration()));
		}
		return whereCondition;
	}

	@Override
	public Class<DataRetentionDTO> getDTOClass() {
		return DataRetentionDTO.class;
	}

}
