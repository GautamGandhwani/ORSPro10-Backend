package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TimeZoneDTO;

@Repository
public class TimeZoneDAOImpl extends BaseDAOImpl<TimeZoneDTO> implements TimeZoneDAOInt{

	@Override
	protected List<Predicate> getWhereClause(TimeZoneDTO dto, CriteriaBuilder builder, Root<TimeZoneDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getTimezoneCode())) {
			whereCondition.add(builder.like(qRoot.get("timezoneCode"), dto.getTimezoneCode() + "%"));
		}
		
		if (!isEmptyString(dto.getTimezoneName())) {
			whereCondition.add(builder.like(qRoot.get("timezoneName"), dto.getTimezoneName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<TimeZoneDTO> getDTOClass() {
		return TimeZoneDTO.class;
	}

}
