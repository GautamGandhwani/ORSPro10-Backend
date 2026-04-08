package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TicketDTO;

@Repository
public class TicketDAOImpl extends BaseDAOImpl<TicketDTO> implements TicketDAOInt{

	@Override
	protected List<Predicate> getWhereClause(TicketDTO dto, CriteriaBuilder builder, Root<TicketDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCategoryName())) {
			whereCondition.add(builder.like(qRoot.get("categoryName"), dto.getCategoryName() + "%"));
		}
		
		if (!isZeroNumber(dto.getPrice())) {
			whereCondition.add(builder.equal(qRoot.get("price"), dto.getPrice()));
		}
		
		if (!isZeroNumber(dto.getAvailableSeats())) {
			whereCondition.add(builder.equal(qRoot.get("availableSeats"), dto.getAvailableSeats()));
		}
		return whereCondition;
	}

	@Override
	public Class<TicketDTO> getDTOClass() {
		return TicketDTO.class;
	}
}