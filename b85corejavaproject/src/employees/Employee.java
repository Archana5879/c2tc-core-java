package employees;

public class Employee {

	public int employee_id;
	public String employee_name;
	public double employee_salary;
	
	public Employee(int employee_id, String employee_name, double employee_salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name
				+ ", employee_salary=" + employee_salary + "]";
	}
	public String getName() {
		return null;
	}
	public String getId() {
			return null;
	}
	public String getSalary() {
		return null;
	}
	

}