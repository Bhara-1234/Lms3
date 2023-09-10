package com.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LoanApplicationDao;
import com.model.LoanApplication;

@Service
public class LmsServiceImpl  {

	@Autowired
	LoanApplicationDao lad;
	@Transactional
	public void adds(LoanApplication la) {
		lad.addDetails(la);
	}
	public ArrayList<LoanApplication> getApplicants(){
		return lad.findAll();		
	}
	public LoanApplication singleApp(int lnap_id) {
		return lad.getApplicant(lnap_id);
	}

}
