package com.example.demo;

public class Employees {
	
	
	private int id ; 
	private String empName ;
	private String salary ;
	private String age ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Employees(int id, String empName, String salary, String age) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", empName=" + empName + ", salary=" + salary + ", age=" + age + "]";
	}
	
	

}
