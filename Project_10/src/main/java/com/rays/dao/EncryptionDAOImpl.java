package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.EncryptionDTO;

@Repository
public class EncryptionDAOImpl extends BaseDAOImpl<EncryptionDTO> implements EncryptionDAOInt{

	@Override
	protected List<Predicate> getWhereClause(EncryptionDTO dto, CriteriaBuilder builder, Root<EncryptionDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAlgorithm())) {
			whereCondition.add(builder.like(qRoot.get("algorithm"), dto.getAlgorithm() + "%"));
		}
		return whereCondition;
		
	}

	@Override
	public Class<EncryptionDTO> getDTOClass() {
		return EncryptionDTO.class;
	}

}
