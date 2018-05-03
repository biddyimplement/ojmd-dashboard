package com.deloitte.dell.ojm.model;

import java.util.List;

public class Summary {

	private List<DataPoint> data;
	private String description;
	private String title;

	private Integer inProgressCount;
	private Integer alertsCount;
	private Integer pastDueCount;
	
	public List<DataPoint> getData() {
		return data;
	}
	public void setData(List<DataPoint> data) {
		this.data = data;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getInProgressCount() {
		return inProgressCount;
	}
	public void setInProgressCount(Integer inProgressCount) {
		this.inProgressCount = inProgressCount;
	}
	public Integer getAlertsCount() {
		return alertsCount;
	}
	public void setAlertsCount(Integer alertsCount) {
		this.alertsCount = alertsCount;
	}
	public Integer getPastDueCount() {
		return pastDueCount;
	}
	public void setPastDueCount(Integer pastDueCount) {
		this.pastDueCount = pastDueCount;
	}

}
