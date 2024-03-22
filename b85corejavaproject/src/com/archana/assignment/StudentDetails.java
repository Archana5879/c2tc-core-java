package com.archana.assignment;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Getting input from the user
		        System.out.println("Enter your Full name with Initial:");
		        String fullNameWithInitial = scanner.nextLine();
		        
		        System.out.println("Enter your Roll number:");
		        String rollNumber = scanner.nextLine();
		        
		        System.out.println("Enter your Grade:");
		        String grade = scanner.nextLine();
		        
		        System.out.println("Enter your Percentage:");
		        String percentage = scanner.nextLine();
		        
		        // Printing the details
		        System.out.println("Full name with Initial: " + fullNameWithInitial);
		        System.out.println("Roll number: " + rollNumber);
		        System.out.println("Grade: " + grade);
		        System.out.println("Percentage: " + percentage);
		        
		        scanner.close();
		    }
		}
