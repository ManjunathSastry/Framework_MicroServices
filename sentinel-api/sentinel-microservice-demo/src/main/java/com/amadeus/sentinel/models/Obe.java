package com.amadeus.sentinel.models;

public class Obe {

	private String obeName;
	private String startDate;
	private String endDate;
	
	public Obe() {}
	
	public Obe(String obeName, String startDate, String endDate) {
		super();
		this.obeName = obeName;
		this.startDate = startDate;
		this.endDate = endDate;
	}



	public String getObeName() {
		return obeName;
	}
	public void setObeName(String obeName) {
		this.obeName = obeName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

}
