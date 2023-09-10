package com.dao;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.model.LoanApplication;

public interface LoanApplicationDao {

	public void addDetails(LoanApplication la);
	public ArrayList<LoanApplication> findAll();
	public LoanApplication getApplicant(int lnap_id);
}
