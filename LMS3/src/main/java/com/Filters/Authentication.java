package com.Filters;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.services.*;


//@WebFilter(
//	    filterName = "Authentication",
//	    urlPatterns = {"/customeroptions.jsp"}
//	)
@Component
public class Authentication extends HttpFilter implements Filter {
	
	CustomerService customerservice;
	
	
	@Autowired
	public Authentication(CustomerService customerservice) {
		super();
		this.customerservice=customerservice;
	}



	public Authentication() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Entered filter"+request.getParameter("username"));
		boolean x=(request.getParameter("username")!=null) && (request.getParameter("password")!=null);
		System.out.println("Entered filter"+x);
		System.out.println(customerservice);
		if(customerservice!=null) {
			System.out.println("madhuuuuuu");
			chain.doFilter(request, response);
		}
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	

}