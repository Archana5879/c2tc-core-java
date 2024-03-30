package b85corejavaproject;
import java.util.Scanner;

import com.archana.assignment.TicketBooking;

public class Main2 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Ticket Booking System!");

	        // Input ticket booking details
	        System.out.print("Enter ticket booking details (stageEvent, customer, noOfSeats): ");
	        String[] bookingDetails = scanner.nextLine().split(",");
	        TicketBooking booking = new TicketBooking(bookingDetails[0], bookingDetails[1], Integer.parseInt(bookingDetails[2]));

	        // Select payment mode
	        System.out.println("Select Payment Mode:");
	        System.out.println("1. Cash payment");
	        System.out.println("2. Wallet payment");
	        System.out.println("3. Credit card payment");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter cash amount: ");
	                double cashAmount = scanner.nextDouble();
	                booking.makePayment(null, cashAmount);
	                break;
	            case 2:
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter wallet amount: ");
	                double walletAmount = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter wallet number: ");
	                String walletNumber = scanner.nextLine();
	                booking.makePayment(walletNumber, walletAmount);
	                break;
	            case 3:
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter cardholder name: ");
	                String cardHolderName = scanner.nextLine();
	                System.out.print("Enter credit card amount: ");
	                double ccAmount = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter credit card type: ");
	                String creditCardType = scanner.nextLine();
	                System.out.print("Enter CCV: ");
	                String ccv = scanner.nextLine();
	                booking.makePayment(cardHolderName, ccAmount, creditCardType, ccv);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        scanner.close();
	    }
	}

