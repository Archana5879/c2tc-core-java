package b85corejavaproject;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of i");
		i=sc.nextInt();
		//While Demo
		/*
		 *  while(i<100) { System.out.println("i="+i); i++; }
		 */
		while(i<100) {
			System.out.println("i="+i);
			i++;
		}
		do {
			System.out.println(i);
			i++;
		} while(i<100);
			
	}

}
	
