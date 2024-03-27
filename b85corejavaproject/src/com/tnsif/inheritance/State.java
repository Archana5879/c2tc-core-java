package com.tnsif.inheritance;

public class State extends Country{
	
		private String stateName;
		private String language;
		
		public State(String stateName, String language,String countryName,String capitalCity) {
			super(countryName,capitalCity);
			this.stateName = stateName;
			this.language = language;
		}

public String getStateName() {
	return stateName;
}

public void setStateName(String stateName) {
	this.stateName = stateName;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

@Override
public String toString() {
	return "State [stateName=" + stateName + ", language=" + language + ", getCountryName()=" + getCountryName()
			+ ", getCapitalCity()=" + getCapitalCity() + "]";
}
}