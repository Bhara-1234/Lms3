package com.dao;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.model.LoanApplication;

public class LoanApplicationDaoImpl implements LoanApplicationDao {
	@PersistenceContext
	private EntityManager em;


	public void addDetails(LoanApplication la) {
		System.out.println(2);

		em.persist(la);
	}
	public ArrayList<LoanApplication> findAll(){
		return (ArrayList<LoanApplication>)em.createQuery("Select l from LoanApplication l").getResultList();
	}
	public LoanApplication getApplicant(int lnap_id) {
		
		String jpql = "SELECT e FROM LoanApplication e WHERE e.id = :entityId";
		LoanApplication loanapplication = em.createQuery(jpql, LoanApplication.class)
		                               .setParameter("entityId",lnap_id)
		                               .getSingleResult();
		return loanapplication;
		
	}

}
