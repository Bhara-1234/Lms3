package com.example.demo;


public class Employee {
		private int empno,dept;
		private String job,name;
		double salary;
		public Employee(int empno, int dept, String job, String name, double salary) {
			super();
			this.empno = empno;
			this.dept = dept;
			this.job = job;
			this.name = name;
			this.salary = salary;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public int getDept() {
			return dept;
		}
		public void setDept(int dept) {
			this.dept = dept;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
		
}