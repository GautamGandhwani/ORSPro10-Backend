package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BlogDTO;

@Repository
public class BlogDAOImpl extends BaseDAOImpl<BlogDTO> implements BlogDAOInt{

	@Override
	protected List<Predicate> getWhereClause(BlogDTO dto, CriteriaBuilder builder, Root<BlogDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getBlogCode())) {
			whereCondition.add(builder.like(qRoot.get("blogCode"), dto.getBlogCode() + "%"));
		}
		
		if (!isEmptyString(dto.getTitle())) {
			whereCondition.add(builder.like(qRoot.get("title"), dto.getTitle() + "%"));
		}
		
		if (!isEmptyString(dto.getAuthor())) {
			whereCondition.add(builder.like(qRoot.get("author"), dto.getAuthor() + "%"));
		}
		
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.equal(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}

	@Override
	public Class<BlogDTO> getDTOClass() {
		return BlogDTO.class;
	}

}
