package com.atos.rest.crudrest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.atos.rest.service.CountryInterface;
import com.atos.rest.service.CountryServiceImpl;

@Path("/publish")
public class Controller {
	
	CountryInterface countryRef=new CountryServiceImpl();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getAllCountries()
	{
		return countryRef.getallcountries();
	}

}
