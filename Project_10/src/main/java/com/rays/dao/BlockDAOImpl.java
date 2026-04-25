package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BlockDTO;

@Repository
public class BlockDAOImpl extends BaseDAOImpl<BlockDTO> implements BlockDAOInt {

	@Override
	protected List<Predicate> getWhereClause(BlockDTO dto, CriteriaBuilder builder, Root<BlockDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		
		if (!isEmptyString(dto.getReason())) {
			whereCondition.add(builder.like(qRoot.get("reasion"), dto.getReason() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<BlockDTO> getDTOClass() {
		return BlockDTO.class;
	}

}
