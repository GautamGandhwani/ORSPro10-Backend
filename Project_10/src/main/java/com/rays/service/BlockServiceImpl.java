package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BlockDAOInt;
import com.rays.dto.BlockDTO;

@Service
@Transactional
public class BlockServiceImpl extends BaseServiceImpl<BlockDTO, BlockDAOInt> implements BlockServiceInt{

}
