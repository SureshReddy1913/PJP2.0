package com.sapient.salaryCal;

public class OutputAttributes {

	private String CountryOrCity;
	private String gender;
	
	public String getCountryOrCity() {
		return CountryOrCity;
	}
	public void setCountryOrCity(String countryOrCity) {
		CountryOrCity = countryOrCity;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CountryOrCity == null) ? 0 : CountryOrCity.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OutputAttributes other = (OutputAttributes) obj;
		if (CountryOrCity == null) {
			if (other.CountryOrCity != null)
				return false;
		} else if (!CountryOrCity.equals(other.CountryOrCity))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		return true;
	}
	
	
}
