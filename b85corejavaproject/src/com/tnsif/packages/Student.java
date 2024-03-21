package com.tnsif.packages;

public class Student {
	
     private  String studentName;
     private long studentPhNo;
     private String studentEmail;
     private String USN;
     
      
      public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getStudentPhNo() {
		return studentPhNo;
	}
	public void setStudentPhNo(long studentPhNo) {
		this.studentPhNo = studentPhNo;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getUSN() {
		return USN;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	public void display() {
    	  System.out.println(studentName+" "+studentPhNo+" "+studentEmail+" "+USN);
      }
     @Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentPhNo=" + studentPhNo + ", studentEmail=" + studentEmail
				+ ", USN=" + USN + "]";
	}
}
