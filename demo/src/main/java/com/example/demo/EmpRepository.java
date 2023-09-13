package com.example.demo;



import java.util.ArrayList;

import org.springframework.stereotype.Repository;
@Repository
public class EmpRepository  implements IEmpRepository{
	ArrayList<Employee> arr = new ArrayList<>();
	
//	this.empno = empno;
//	this.dept = dept;
//	this.job = job;
//	this.name = name;
//	this.salary = salary;

	public ArrayList<Employee> getEmpList(){
		if(arr.size()==0) {
		arr.add(new Employee(11,1,"clerk","steve",100000));
		arr.add(new Employee(22,2,"broker","eddy",20000));
		arr.add(new Employee(33,2,"racer","billy",30000));
		arr.add(new Employee(44,1,"manager","harry",14500));
		arr.add(new Employee(55,3,"nojob","mandy",3000000));
		}
		return arr;
		
	}
	
	public  void deleteEmployee(int id) {
		for(Employee e: arr) {
			if(e.getEmpno()==id) {
				arr.remove(e);
			}
		}
		
	}

	@Override
	public void addEmployee(Employee emp) {
	
			arr.add(emp);
		
		
	}

	@Override
	public void updateSave(Employee emp) {
		deleteEmployee(emp.getEmpno());
		addEmployee(emp);
		
	}

	
	
}
