package com.archana.assignment.employees;

public class Developer extends Employee{

		private static double employee_salary;
		private String programmingLanguage;

		public Developer(int employee_id, String employee_name, double employee_salary, String programmingLanguage) {
			super(employee_id, employee_name, employee_salary);
			this.programmingLanguage = programmingLanguage;
		}

		public Developer() {
			super(employee_id, getEmployee_name(), employee_salary);
			this.programmingLanguage = programmingLanguage;
		}

		public String getProgrammingLanguage() {
			return programmingLanguage;
		}

		public void setProgrammingLanguage(String programmingLanguage) {
			this.programmingLanguage = programmingLanguage;
		}

		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getId() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getSalary() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setName(String string) {
			return;
		}
		
		
}
