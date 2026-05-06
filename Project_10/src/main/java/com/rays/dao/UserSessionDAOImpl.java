package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.UserSessionDTO;

@Repository
public class UserSessionDAOImpl extends BaseDAOImpl<UserSessionDTO> implements UserSessionDAOInt{

	@Override
	protected List<Predicate> getWhereClause(UserSessionDTO dto, CriteriaBuilder builder, Root<UserSessionDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		
		if (isNotNull(dto.getLoginTime())) {
			whereCondition.add(builder.like(qRoot.get("loginTime"), dto.getLoginTime() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<UserSessionDTO> getDTOClass() {
		return UserSessionDTO.class;
	}
}

