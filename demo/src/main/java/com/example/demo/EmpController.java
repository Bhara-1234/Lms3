package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmpController {

	@Autowired  
	private IEmpRepository emprepo;
	
	//mapping the getAllEmployees() method to /employees  
	@GetMapping(value = "/employees")  
	public ArrayList<Employee> getAllEmployees(){  
		//finds all the products  
		ArrayList<Employee> emps = emprepo.getEmpList();  
		System.out.println(emps.size());
		//returns the product list  
		return emps;  
	} 
	
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteEmp(@PathVariable("id") int id){
		System.out.println(id);
		
		emprepo.deleteEmployee(id);
		return  new ResponseEntity<>("Deleted",HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public ResponseEntity<Object> addEmployee(@RequestBody Employee emp){
		emprepo.addEmployee(emp);
		return  new ResponseEntity<>("ADDED",HttpStatus.OK);
		
	}
	@RequestMapping(value="/employees",method=RequestMethod.PUT)
	public ResponseEntity<Object> updateSave(@RequestBody Employee emp){
		emprepo.updateSave(emp);
		return new ResponseEntity<>("Updated",HttpStatus.OK);
	}
	
	
}