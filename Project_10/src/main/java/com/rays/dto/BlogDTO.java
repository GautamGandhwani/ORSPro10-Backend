package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_BLOG")
public class BlogDTO extends BaseDTO{

	@Column(name = "BLOG_CODE", length = 50)
	private String blogCode;
	
	@Column(name = "TITLE", length = 50)
	private String title;
	
	@Column(name = "AUTHOR", length = 50)
	private String author;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getBlogCode() {
		return blogCode;
	}

	public void setBlogCode(String blogCode) {
		this.blogCode = blogCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return blogCode;
	}

	@Override
	public String getUniqueKey() {
		return "blogCode";
	}

	@Override
	public String getUniqueValue() {
		return blogCode;
	}

	@Override
	public String getLabel() {
		return "Blog";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("blogCode", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("blogCode", blogCode);
		return map;
	}
}