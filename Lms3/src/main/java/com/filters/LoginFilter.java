package com.filters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImp;
import com.dao.LoanApplicantDao;
import com.services.CustomerService;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/Login")
public class LoginFilter implements Filter {
	
	
	
	@Autowired
	CustomerDao cd ;





	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Your filter logic, including using customerService to validate customers
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		System.out.println(email + pwd);
		if (cd.validateCustomer(email, pwd)) {
			chain.doFilter(request, response);
		} else {
			System.out.println("Wrong credentials");
		}
	}

}
