package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BlogDTO;

public class BlogForm extends BaseForm {

	@NotEmpty(message = "please enter blog code")
	private String blogCode;

	@NotEmpty(message = "please enter title")
	private String title;

	@NotEmpty(message = "please enter author")
	private String author;

	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {

		BlogDTO dto = initDTO(new BlogDTO());
		dto.setBlogCode(blogCode);
		dto.setTitle(title);
		dto.setAuthor(author);
		dto.setStatus(status);
		return dto;
	}
}
