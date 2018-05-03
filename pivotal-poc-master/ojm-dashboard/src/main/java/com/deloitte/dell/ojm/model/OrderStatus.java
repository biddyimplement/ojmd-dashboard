/**
 * 
 */
package com.deloitte.dell.ojm.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author abadami
 *
 */
public class OrderStatus {

	private String orderTitle;
	private String status;
	private String subStatus;
	private Date dueDate;
	
	private Map<String,String> orderDetails;
	
	private List<DataPoint> orderDetailList;
	
	private String reviewLink;

	public String getOrderTitle() {
		return orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Map<String, String> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Map<String, String> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getReviewLink() {
		return reviewLink;
	}

	public void setReviewLink(String reviewLink) {
		this.reviewLink = reviewLink;
	}

	public List<DataPoint> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<DataPoint> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
}
