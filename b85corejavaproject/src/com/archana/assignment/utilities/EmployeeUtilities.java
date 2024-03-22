package com.archana.assignment.utilities;

import com.archana.assignment.employees.Developer;
import com.archana.assignment.employees.Manager;

import employees.Employee;

public class EmployeeUtilities {
		
	    public  void printEmployeeDetails(Manager manager) {
	    	System.out.println("Employee Details:");
	    	System.out.println("Name:"+ manager.getName());
	    	System.out.println("ID:"+manager.getId());
	    	System.out.println("Salary:"+manager.getSalary());
	    	}

		public void printEmployeeDetails(Developer developer) {
			System.out.println("Employee Details:");
	    	System.out.println("Name:"+ developer.getName());
	    	System.out.println("ID:"+developer.getId());
	    	System.out.println("Salary:"+developer.getSalary());
		
			
		}

	}
