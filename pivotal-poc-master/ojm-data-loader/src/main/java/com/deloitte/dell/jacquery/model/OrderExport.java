package com.deloitte.dell.jacquery.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

@Entity(name="order_export")
public class OrderExport {

	@Column(name="created_on")
	@Temporal(TemporalType.DATE)
	@CsvBindByName(column = "Created On")
    @CsvDate("MM/dd/yyyy hh:mm")
	private	Date	createdOn; 	// 3/2/2018 0:45		

	@Id
	@Column(name="sales_order_num")
	@CsvBindByName(column = "Sales Order #")
	private	String	salesOrderNum;	// 13746597389		

	@Column(name="type")
	@CsvBindByName(column = "Type")
	private	String	type; 			// Standard	Order
	
	@Column(name="sales_team")	
	@CsvBindByName(column = "Sales Team")
	private	String	salesTeam; 		// Nandita	Bapaye
	
	@Column(name="submitted_by")	
	@CsvBindByName(column = "Submitted By")
	private	String	submittedBy; 	// VINODP
	
	@Column(name="account")	
	@CsvBindByName(column = "Account")
	private	String	account; 		// PENTAGON
	
	@Column(name="last_name")
	@CsvBindByName(column = "Last Name")
	private	String	lastName; 		// Gowin		
	
	@Column(name="first_name")
	@CsvBindByName(column = "First Name")
	private	String	firstName; 		// John
	
	@Column(name="end_user")
	@CsvBindByName(column = "End User")
	private	String	endUser; 		// PENTAGON			
	
	@Column(name="billing_account")
	@CsvBindByName(column = "Billing Account")
	private	String	billingAccount; // PENTAGON
	
	@Column(name="purchase_order_num")
	@CsvBindByName(column = "Purchase Order #")
	private	String	purchaseOrderNum; // 3456709876556	
	
	@Column(name="sales_channel")
	@CsvBindByName(column = "Sales Channel")
	private	String	salesChannel; 	// DFSLP
	
	@Column(name="contract")
	@CsvBindByName(column = "Contract")
	private	String	contract; 		// CONTRACT	FOR	SVL	DEMO
	
	@Column(name="sub_type")
	@CsvBindByName(column = "Sub Type")
	private	String	subType; 		// 			
	
	@Column(name="original_sales_order_num")
	@CsvBindByName(column = "Original Sales Order #")
	private	String	originalSalesOrderNum; // 			
	
	@Column(name="dpid")
	@CsvBindByName(column = "DPID")
	private	String	dpid; 			// 137465973891			
	
	@Column(name="source")
	@CsvBindByName(column = "Source")
	private	String	source; 		// DSA			
	
	@Column(name="cancel_reenter")
	@CsvBindByName(column = "Cancel/Re-enter")
	private	String	cancelReenter; 	// N			

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getSalesOrderNum() {
		return salesOrderNum;
	}

	public void setSalesOrderNum(String salesOrderNum) {
		this.salesOrderNum = salesOrderNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSalesTeam() {
		return salesTeam;
	}

	public void setSalesTeam(String salesTeam) {
		this.salesTeam = salesTeam;
	}

	public String getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEndUser() {
		return endUser;
	}

	public void setEndUser(String endUser) {
		this.endUser = endUser;
	}

	public String getBillingAccount() {
		return billingAccount;
	}

	public void setBillingAccount(String billingAccount) {
		this.billingAccount = billingAccount;
	}

	public String getPurchaseOrderNum() {
		return purchaseOrderNum;
	}

	public void setPurchaseOrderNum(String purchaseOrderNum) {
		this.purchaseOrderNum = purchaseOrderNum;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getOriginalSalesOrderNum() {
		return originalSalesOrderNum;
	}

	public void setOriginalSalesOrderNum(String originalSalesOrderNum) {
		this.originalSalesOrderNum = originalSalesOrderNum;
	}

	public String getDpid() {
		return dpid;
	}

	public void setDpid(String dpid) {
		this.dpid = dpid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCancelReenter() {
		return cancelReenter;
	}

	public void setCancelReenter(String cancelReenter) {
		this.cancelReenter = cancelReenter;
	}

	
}
