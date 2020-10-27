package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CountryDTO;

@RestController
@RequestMapping("/api")
public class CountryController {

	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
	
	private static List<CountryDTO> countriesList;
	
	static {
		countriesList = new ArrayList<CountryDTO>();
		
		CountryDTO country1 = new CountryDTO();
		country1.setId(1);
		country1.setName("Chile");
		country1.setCapital("Santiago");
		country1.setPopulation(17574003);
		country1.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/7/78/Flag_of_Chile.svg");
		
		CountryDTO country2 = new CountryDTO();
		country2.setId(2);
		country2.setName("Argentina");
		country2.setCapital("Buenos Aires");
		country2.setPopulation(40117096);
		country2.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Argentina.svg");		
		
		CountryDTO country3 = new CountryDTO();
		country3.setId(3);
		country3.setName("Peru");
		country3.setCapital("Lima");
		country3.setPopulation(31237385);
		country3.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/3/3a/Bandera_del_Per%C3%BA.jpg");	
		
		CountryDTO country4 = new CountryDTO();
		country4.setId(4);
		country4.setName("Bolivia");
		country4.setCapital("La Paz");
		country4.setPopulation(11428245);
		country4.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Bandera_de_Bolivia_%28Estado%29.svg/1200px-Bandera_de_Bolivia_%28Estado%29.svg.png");	
		
		CountryDTO country5 = new CountryDTO();
		country5.setId(5);
		country5.setName("Paraguay");
		country5.setCapital("Asuncion");
		country5.setPopulation(7252672);
		country5.setImageFlagUrl("https://upload.wikimedia.org/wikipedia/commons/2/27/Flag_of_Paraguay.svg");			
		
		countriesList.add(country1);
		countriesList.add(country2);
		countriesList.add(country3);
		countriesList.add(country4);
		countriesList.add(country5);
	}	
	
	@GetMapping("/countries")
	public List<CountryDTO> getAllCountries() {
		logger.debug("[CountryController][getAllCountries][START]");
		
		logger.debug("[CountryController][getAllCountries][Total: " + countriesList.size() + "]");
		
		logger.debug("[CountryController][getAllCountries][END]");
		return countriesList;
	}
	
}
