package com.archana.assignment;

class Student {
    public Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails(String name, String address, String phone, double salesAmount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salesAmount = salesAmount;
    }

    public double calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000 && salesAmount < 100000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            commission = salesAmount * 0.03;
        }
        return commission;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();

        // Creating a Commission object
        Commission commission = new Commission();

        // Accepting details of the sales employee
        commission.acceptDetails("John Doe", "123 Main St", "555-1234", 75000);

        // Calculating commission
        double commissionAmount = commission.calculateCommission();

        // Displaying commission amount
        System.out.println("Commission: $" + commissionAmount);
    }
}