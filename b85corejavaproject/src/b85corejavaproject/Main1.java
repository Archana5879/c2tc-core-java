package b85corejavaproject;

import java.util.Scanner;

import com.archana.assignment.TicketBooking;

public class Main1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Ticket Booking System!");

	        // Input stage event details
	        System.out.print("Enter stage event name: ");
	        String event = scanner.nextLine();

	        System.out.print("Enter customer name: ");
	        String customer = scanner.nextLine();

	        System.out.print("Enter number of seats: ");
	        int seats = scanner.nextInt();

	        TicketBooking booking = new TicketBooking(event, customer, seats);

	        // Select payment method
	        System.out.println("Select Payment Method:");
	        System.out.println("1. Cash");
	        System.out.println("2. Wallet");
	        System.out.println("3. Credit Card");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter cash amount: $");
	                double cashAmount = scanner.nextDouble();
	                booking.makePayment(customer, cashAmount);
	                break;
	            case 2:
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter wallet number: ");
	                String walletNumber = scanner.nextLine();
	                System.out.print("Enter wallet amount: $");
	                double walletAmount = scanner.nextDouble();
	                booking.makePayment(walletNumber, walletAmount);
	                break;
	            case 3:
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter credit card number: ");
	                String creditCard = scanner.nextLine();
	                System.out.print("Enter CCV: ");
	                String ccv = scanner.nextLine();
	                System.out.print("Enter card holder name: ");
	                String cardHolderName = scanner.nextLine();
	                System.out.print("Enter credit card amount: $");
	                double ccAmount = scanner.nextDouble();
	                booking.makePayment(creditCard, ccv, cardHolderName, ccAmount);
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }

	        scanner.close();
	    }
	}
