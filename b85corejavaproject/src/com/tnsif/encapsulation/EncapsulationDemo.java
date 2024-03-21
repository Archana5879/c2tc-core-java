package com.tnsif.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		Student obj=new Student();
        obj.setStudentName("Archana");
        obj.setStudentEmail("archanagt00@gmail.com");
        obj.setStudentPhNo(6360175736L);
        obj.setUSN("1EW123");
        System.out.println(obj);
        
        Student obj1=new Student();
        obj1.setStudentName("Ashwini");
        obj1.setStudentEmail("ashwinigt00@gmail.com");
        obj1.setStudentPhNo(987654321L);
        obj1.setUSN("1EW124");
        System.out.println(obj1);
	
	}
}
