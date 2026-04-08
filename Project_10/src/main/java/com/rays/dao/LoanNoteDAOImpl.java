package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LoanNoteDTO;

@Repository
public class LoanNoteDAOImpl extends BaseDAOImpl<LoanNoteDTO>implements LoanNoteDAOInt{

	@Override
	protected List<Predicate> getWhereClause(LoanNoteDTO dto, CriteriaBuilder builder, Root<LoanNoteDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getLenderName())) {
			whereCondition.add(builder.like(qRoot.get("lenderName"), dto.getLenderName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<LoanNoteDTO> getDTOClass() {
		return LoanNoteDTO.class;
	}
}