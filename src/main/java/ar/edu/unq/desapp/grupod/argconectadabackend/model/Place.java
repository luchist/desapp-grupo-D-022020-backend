package ar.edu.unq.desapp.grupod.argconectadabackend.model;

public class Place {
	
	private String name;
	
	private String province;
	
	private int population;
	
	private boolean connectivity;
	
	public Place() {
		
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

	public boolean isConnectivity() {
		return this.connectivity;
	}

	public void setConnectivity(boolean connectivity) {
		this.connectivity = connectivity;
	}
}
