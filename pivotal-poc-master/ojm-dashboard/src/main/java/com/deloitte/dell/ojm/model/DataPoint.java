package com.deloitte.dell.ojm.model;

public class DataPoint {

	private String title;
	private Integer count;
	private Integer countInProgress;
	private Integer countAlerts;
	private Integer countPastDue;
	private String description;

	public DataPoint() {
		
	}
	
	public DataPoint(String title, Integer count, String description) {
		this.title = title;
		this.count = count;
		this.description = description;
	}
	
	//label data
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCountInProgress() {
		return countInProgress;
	}

	public void setCountInProgress(Integer countInProgress) {
		this.countInProgress = countInProgress;
	}

	public Integer getCountAlerts() {
		return countAlerts;
	}

	public void setCountAlerts(Integer countAlerts) {
		this.countAlerts = countAlerts;
	}

	public Integer getCountPastDue() {
		return countPastDue;
	}

	public void setCountPastDue(Integer countPastDue) {
		this.countPastDue = countPastDue;
	}
	
}
