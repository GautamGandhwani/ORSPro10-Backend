package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LoanNoteDAOInt;
import com.rays.dto.LoanNoteDTO;

@Service
@Transactional
public class LoanNoteServiceImpl extends BaseServiceImpl<LoanNoteDTO, LoanNoteDAOInt> implements LoanNoteServiceInt{

}
