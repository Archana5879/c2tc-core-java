package b85corejavaproject;
import com.archana.assignment.employees.Manager;
import com.archana.assignment.employees.Developer;
import com.archana.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
      
        Manager manager = new Manager("John Doe", 1001, 60000, "Sales");
        Developer developer = new Developer("Alice Smith", 2001, 70000, "Java");

        EmployeeUtilities.displayManagerDetails(manager);
        System.out.println();
        EmployeeUtilities.displayDeveloperDetails(developer);
	}
}