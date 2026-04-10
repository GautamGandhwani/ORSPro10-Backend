package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RideSharingDTO;

@Repository
public class RideSharingDAOImpl extends BaseDAOImpl<RideSharingDTO> implements RideSharingDAOInt{

	@Override
	protected List<Predicate> getWhereClause(RideSharingDTO dto, CriteriaBuilder builder, Root<RideSharingDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDriverName())) {
			whereCondition.add(builder.like(qRoot.get("driverName"), dto.getDriverName() + "%"));
		}
		
		if (!isEmptyString(dto.getVehicleType())) {
			whereCondition.add(builder.like(qRoot.get("vehicleType"), dto.getVehicleType() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<RideSharingDTO> getDTOClass() {
		return RideSharingDTO.class;
	}

}
