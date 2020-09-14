package ar.edu.unq.desapp.grupod.argconectadabackend.model;

import java.time.LocalDateTime;

public class Project {
	
	private Place place;

	private double factor;

	private int minimumPercentageOfProjectClosure;

	private String nameOfProject;

	private LocalDateTime projectStartDate;

	private LocalDateTime projectEndDate;

	public Project(Place place, String nameOfProject, LocalDateTime projectStartDate, LocalDateTime projectEndDate) {
		this.factor = 1000;
		this.minimumPercentageOfProjectClosure = 100;
		this.nameOfProject = nameOfProject;
		this.projectStartDate = projectStartDate;
		this.projectEndDate = projectEndDate;
	}
	
	public double costOfProject() {
		return place.getPopulation() * this.factor;
	}

	public double getFactor() {
		return this.factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public int getMinimumPercentageOfProjectClosure() {
		return this.minimumPercentageOfProjectClosure;
	}

	public void setMinimumPercentageOfProjectClosure(int minimumPercentageOfProjectClosure) {
		this.minimumPercentageOfProjectClosure = minimumPercentageOfProjectClosure;
	}

	public String getNameOfProject() {
		return nameOfProject;
	}

	public void setNameOfProject(String nameOfProject) {
		this.nameOfProject = nameOfProject;
	}

	public LocalDateTime getProjectEndDate() {
		return this.projectEndDate;
	}

	public void setProjectEndDate(LocalDateTime projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public LocalDateTime getProjectStartDate() {
		return this.projectStartDate;
	}

	public void setProjectStartDate(LocalDateTime projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

}
