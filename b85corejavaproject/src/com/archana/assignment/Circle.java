package com.archana.assignment;
import java.util.Scanner;

public class Circle {
	    double radius;
	    String color;

	    public void getInput() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter radius:");
	        radius = scanner.nextDouble();

	        System.out.println("Enter color:");
	        color = scanner.next();

	        scanner.close();
	    }

	    public void calcArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of the circle with radius " + radius + " and color " + color + " is: " + area);
	    }
	    public static void main(String[] args) {
	        Circle circle = new Circle();
	        circle.getInput(); 
	        circle.calcArea();
	    }
	}

