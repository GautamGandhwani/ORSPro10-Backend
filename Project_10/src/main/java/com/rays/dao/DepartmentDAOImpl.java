package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;

@Repository
public class DepartmentDAOImpl extends BaseDAOImpl<DepartmentDTO> implements DepartmentDAOInt{

	@Override
	protected List<Predicate> getWhereClause(DepartmentDTO dto, CriteriaBuilder builder, Root<DepartmentDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDepartmentCode())) {

			whereCondition.add(builder.like(qRoot.get("departmentCode"), dto.getDepartmentCode() + "%"));
		}
		if (!isEmptyString(dto.getDepartmentName())) {

			whereCondition.add(builder.like(qRoot.get("departmentName"), dto.getDepartmentName() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<DepartmentDTO> getDTOClass() {
		return DepartmentDTO.class;
	}
}