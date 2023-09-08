package com.dao;

import com.model.Customer;

public interface CustomerDao {

	public boolean validateCustomer(String email, String pwd);

}
