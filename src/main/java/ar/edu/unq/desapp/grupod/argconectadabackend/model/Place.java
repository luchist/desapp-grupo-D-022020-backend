package ar.edu.unq.desapp.grupod.argconectadabackend.model;

public class Place {
	
	private String name;
	
	private String province;
	
	private int population;
	
	private String status;
	
	public Place(String name, String province, int population, String status) {
		this.name = name;
		this.province = province;
		this.population = population;
		this.status = status;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
