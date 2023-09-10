package com.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.LoanApplication;

import com.services.LmsServiceImpl;

@Controller
public class LmsController {

	
	
	LmsServiceImpl lms;
	@Autowired
	LmsController(LmsServiceImpl lms){
		this.lms=lms;
	}
	
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model) {
		return "about";
		
	}
	
@RequestMapping(value="/admin",method=RequestMethod.GET)
public String user(Model model) {
	return "adminlogin";
	
}

@RequestMapping(value="/customer",method=RequestMethod.GET)
public String customer(Model model) {
	return "customerlogin";
}

@RequestMapping(value="/admindash",method=RequestMethod.GET)
public String admindash(Model model) {
	return "admindashboard";
}

@RequestMapping(value="/customerdash",method=RequestMethod.GET)
public String customerdash(Model model) {
	return "customerdashboard";
}
@RequestMapping(value="/applyloan",method=RequestMethod.GET)
public String loanDetails(Model model) {
	return "LoanApplicantDetails";
}
@RequestMapping(value="/loanapplication",method=RequestMethod.GET)
public String preview(Model model,LoanApplication loanapplication) {
	model.addAttribute("loanapplication",loanapplication);
	return "preview";
}
@RequestMapping(value="/save",method=RequestMethod.GET)
@Transactional
public String save(Model model,LoanApplication loanapplication ) {
	System.out.println(loanapplication);
    lms.adds(loanapplication);
	return "success";
	
}
@RequestMapping(value="/checkeligiblity",method=RequestMethod.GET)
public String check(Model model) {
	return "loaneligibility";
	
}

@RequestMapping(value="/applicantslist",method=RequestMethod.GET)
public String viewList(Model model) {
	
	ArrayList<LoanApplication> applicants=lms.getApplicants();
	model.addAttribute("applicants", applicants);
	return "viewapplicants";
	
}
@RequestMapping(value="/edit",method=RequestMethod.GET)
public String edit(Model model,@RequestParam("lnap_id") int id) {
	 LoanApplication loanapplication =lms.singleApp(id);
	 model.addAttribute("loanapplication",loanapplication);
	return "edit";
}
}
