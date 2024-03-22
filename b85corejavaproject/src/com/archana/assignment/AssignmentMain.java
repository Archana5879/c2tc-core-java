package com.archana.assignment;

import com.archana.assignment.employees.Developer;
import com.archana.assignment.employees.Manager;
import com.archana.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
		
		Manager manager=new Manager();
		manager.setEmployee_id(101);
		manager.setEmployee_name("Ajay");
		manager.setEmployee_salary(70000);
		manager.setDepartment("Human Resources");
		
		Developer developer=new Developer();
		developer.setEmployee_id(102);
		developer.setName("Alice Smith");
		developer.setEmployee_salary(60000);
		developer.setProgrammingLanguage("Java");
		
		EmployeeUtilities utilites=new EmployeeUtilities();
		utilites.printEmployeeDetails(manager);
		utilites.printEmployeeDetails(developer);
		}

	}
