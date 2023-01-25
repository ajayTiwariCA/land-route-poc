package com.rout.routing.serviceImpl;

import java.io.File;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rout.routing.model.Countries;
import com.rout.routing.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {


	@Override
	public Countries[] getListCountry() {
		
		
		Countries[] countriesArray = null;
		
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			countriesArray = objectMapper.readValue(new File("src/main//resources//countries.json"),
					Countries[].class);

		} catch (Exception e) {

			e.printStackTrace();
		}



		return countriesArray;

	}

}
