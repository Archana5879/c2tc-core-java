package b85corejavaproject;
import java.util.Scanner;
public class IfElseDemo {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt(); 
		
		
		if(age>=18) {
			System.out.println("You are eligible for voting");
		System.out.println("Bring your voter ID");
		
	}
	else { 
		System.out.println("Not eligible for voting");
		System.out.println("You nedd to wait for some more years");
	
		System.out.println("Vote for India");
	}
}
}
