package com.tnsif.inheritance;

public class Student1 extends Person {
	 private String className;
	    private double percentage;

	    public Student1(String name, String city, String className, double percentage) {
	        super(name, city);
	        this.className = className;
	        this.percentage = percentage;
	    }

	    public String getClassName() {
	        return className;
	    }

	    public void setClassName(String className) {
	        this.className = className;
	    }

	    public double getPercentage() {
	        return percentage;
	    }

	    public void setPercentage(double percentage) {
	        this.percentage = percentage;
	    }

		@Override
		public String toString() {
			return "Student1 [className=" + className + ", percentage=" + percentage + ", getName()=" + getName()
					+ ", getCity()=" + getCity() + "]";
		}

}
