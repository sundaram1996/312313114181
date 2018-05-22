package org.arpit.java2blog.pojo;

public class Country{
	 
	 int id;
	 String countryName; 
	 long population;
	 String president;
	 int no_of_states;
	public Country(int id, String countryName, long population,
			String president, int no_of_states) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.population = population;
		this.president = president;
		this.no_of_states = no_of_states;
	}
	public Country() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public int getNo_of_states() {
		return no_of_states;
	}
	public void setNo_of_states(int no_of_states) {
		this.no_of_states = no_of_states;
	}
	 
	
	 
	}