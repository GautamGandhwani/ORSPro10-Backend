package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BlogDAOInt;
import com.rays.dto.BlogDTO;

@Service
@Transactional
public class BlogServiceImpl extends BaseServiceImpl<BlogDTO, BlogDAOInt> implements BlogServiceInt{

}