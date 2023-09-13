package com.example.demo;

import java.util.ArrayList;

public interface IEmpRepository {
	public ArrayList<Employee> getEmpList();
	public void deleteEmployee(int id);
	public void addEmployee(Employee emp);
	public void updateSave(Employee emp);

}
