package com.example.demo.dto;

public class CountryDTO {

	private Integer id;
	private String name;
	private String capital;
	private long population;
	private String imageFlagUrl;
	
	public String toString() {
		String strCountry = "\n<CountryDTO>\n";
		strCountry = strCountry + "[id=" + id + "]\n";
		strCountry = strCountry + "[name=" + name + "]\n";
		strCountry = strCountry + "[capital=" + capital + "]\n";
		strCountry = strCountry + "[population=" + population + "]\n";
		strCountry = strCountry + "[imageFlagUrl=" + imageFlagUrl + "]\n";
		strCountry = strCountry + "</CountryDTO>\n";
		
		return strCountry;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getImageFlagUrl() {
		return imageFlagUrl;
	}

	public void setImageFlagUrl(String imageFlagUrl) {
		this.imageFlagUrl = imageFlagUrl;
	}
	
}
