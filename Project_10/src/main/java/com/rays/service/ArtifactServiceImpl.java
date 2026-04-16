package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ArtifactDAOInt;
import com.rays.dto.ArtifactDTO;

@Service
@Transactional
public class ArtifactServiceImpl extends BaseServiceImpl<ArtifactDTO, ArtifactDAOInt> implements ArtifactServiceInt{

}
