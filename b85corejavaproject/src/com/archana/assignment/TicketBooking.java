package com.archana.assignment;

public class TicketBooking {
	private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Constructors
    public TicketBooking() {
    }

    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Payment methods
    public void makePayment(String cardHolderName, Double amount, String creditCardType, String ccv) {
        System.out.println("Cash payment of $" + amount + " received for " + stageEvent + ".");
        printReceipt();
    }

    public void makePayment(String walletNumber, Double amount) {
        System.out.println("Wallet payment of $" + amount + " received for " + stageEvent + ".");
        printReceipt();
    }

    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        System.out.println("Credit card payment of $" + amount + " received for " + stageEvent + ".");
        printReceipt();
    }

    // Helper method to print receipt
    private void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("Stage Event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println("Thank you for your payment!");
    }
}
