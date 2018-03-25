package org.arpit.java2blog.dto;

import java.util.List;

import org.arpit.java2blog.model.Country;

public class CountryList {
	List<Country> countries;
	
	public CountryList(List<Country> countries) {
		this.countries = countries;
	}
	
	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
}
