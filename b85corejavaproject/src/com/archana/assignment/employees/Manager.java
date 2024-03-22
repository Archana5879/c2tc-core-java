package com.archana.assignment.employees;

public class Manager extends Employee  {

	private static double employee_salary;
	public String department;
	
	public Manager(int employee_id, String employee_name, double employee_salary, String department) {
		super(employee_id, employee_name, employee_salary);
		this.department = department;
	}
	public Manager() {
		super(employee_id, employee_name, employee_salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}

