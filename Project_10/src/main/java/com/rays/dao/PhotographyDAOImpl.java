package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PhotographyDTO;

@Repository
public class PhotographyDAOImpl extends BaseDAOImpl<PhotographyDTO> implements PhotographyDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PhotographyDTO dto, CriteriaBuilder builder, Root<PhotographyDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getClientName())) {

			whereCondition.add(builder.like(qRoot.get("clientName"), dto.getClientName() + "%"));
		}
		
		if (!isEmptyString(dto.getEventType())) {

			whereCondition.add(builder.like(qRoot.get("eventType"), dto.getEventType() + "%"));
		}

		if (isNotNull(dto.getBookingDate())) {
			whereCondition.add(builder.equal(qRoot.get("bookingDate"), dto.getBookingDate()));
		}
		return whereCondition;
	}

	@Override
	public Class<PhotographyDTO> getDTOClass() {
		return PhotographyDTO.class;
	}

}