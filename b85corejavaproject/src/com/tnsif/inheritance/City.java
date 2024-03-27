package com.tnsif.inheritance;

public class City extends State {
	
	private String name;
	private int area;
	
	public City(String name,int area,String stateName, String language, String countryName, String capitalCity) {
		super(stateName, language, countryName, capitalCity);
		this.name=name;
		this.area=area;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getArea() {
		return area;
	}

    public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", area=" + area + ", getStateName()=" + getStateName() + ", getLanguage()="
				+ getLanguage() + ", getCountryName()=" + getCountryName() + ", getCapitalCity()=" + getCapitalCity()
				+ "]";
	}
}
