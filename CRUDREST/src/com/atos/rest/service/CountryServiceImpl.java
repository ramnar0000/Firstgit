package com.atos.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.atos.rest.model.Country;

public class CountryServiceImpl implements CountryInterface {
	
	private List<Country> Country=new ArrayList<Country>();

	@Override
	public List<Country> getallcountries() {
		Country countryModel=new Country();
		countryModel.setId(1);
		countryModel.setCountryname("India");
		countryModel.setPopulation(150000);
		Country.add(countryModel);
		
		return Country;
	}
	
	
}

