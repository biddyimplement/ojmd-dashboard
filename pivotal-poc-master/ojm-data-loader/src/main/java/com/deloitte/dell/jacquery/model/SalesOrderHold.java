/**
 * 
 */
package com.deloitte.dell.jacquery.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

/**
 * @author abadami
 *
 */
@Entity(name="sales_order_hold")
public class SalesOrderHold {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="sales_order_num")
	@CsvBindByName(column = "Sales Order #")
	private String salesOrderNum;  // 13741855123   

	@Column(name="selection")
	@CsvBindByName(column = "Select")
	private String select;  // N     


	@Column(name="line_num")
	@CsvBindByName(column = "Line #")
	private String lineNum;  // 

	@Column(name="po_type")
	@CsvBindByName(column = "PO Type")
	private String poType;  // Standard               


	@Column(name="sub_type")
	@CsvBindByName(column = "Sub Type")
	private String subType;  // Sales Order              


	@Column(name="billing_account")
	@CsvBindByName(column = "Billing Account")
	private String billingAccount;  // PENTAGON               


	@Column(name="end_user")
	@CsvBindByName(column = "End User")
	private String endUser;  // PENTAGON               


	@Column(name="date_ordered")
	@Temporal(TemporalType.DATE)
	@CsvBindByName(column = "Date Ordered")
	@CsvDate("MM/dd/yyyy hh:mm")
	private Date dateOrdered;  //                


	@Column(name="po_num")
	@CsvBindByName(column = "PO #")
	private String poNum;  // 212121               


	@Column(name="sales_team")
	@CsvBindByName(column = "Sales Team")               
	private String salesTeam;  // FBE_SBL_TEST_USER_19               

	@Column(name="hold_name")
	@CsvBindByName(column = "Hold Name")
	private String holdName;  // Quality Check Hold             


	@Column(name="hold_description")
	@CsvBindByName(column = "Hold Description")
	private String holdDescription;  // A quality check hold will be placed on the order when the PO is above $100K

	@Column(name="applied_by")
	@CsvBindByName(column = "Applied By")
	private String appliedBy;  // PRATIBHAB               


	@Column(name="applied_on")
	@CsvBindByName(column = "Applied On")
	@Temporal(TemporalType.DATE)
	@CsvDate("MM/dd/yyyy hh:mm")
	private Date appliedOn;  // 2/22/2018 3:27              


	@Column(name="applied_comments")
	@CsvBindByName(column = "Applied Comments")
	private String appliedComments;  //                


	@Column(name="released_by")
	@CsvBindByName(column = "Released By")
	private String releasedBy;  //                


	@Column(name="released_on")
	@CsvBindByName(column = "Released On")
	@Temporal(TemporalType.DATE)
	@CsvDate("MM/dd/yyyy hh:mm")
	private Date releasedOn;  //                


	@Column(name="release_comments")
	@CsvBindByName(column = "Release Comments")
	private String releaseComments;  //                


	@Column(name="release_reason")
	@CsvBindByName(column = "Release Reason")
	private String releaseReason;  //                


	@Column(name="releasing_role")
	@CsvBindByName(column = "Releasing Role")
	private String releasingRole;  // QR Team              


	@Column(name="hold_level")
	@CsvBindByName(column = "Hold Level")
	private String holdLevel;  // Header               


	@Column(name="assigned_to")
	@CsvBindByName(column = "Assigned To")
	private String assignedTo;  //                


	@Column(name="status")
	@CsvBindByName(column = "Status")
	private String status;  // On Hold              

	public String getSalesOrderNum() {
		return salesOrderNum;
	}
	public void setSalesOrderNum(String salesOrderNum) {
		this.salesOrderNum = salesOrderNum;
	}
	public String getSelect() {
		return select;
	}
	public void setSelect(String select) {
		this.select = select;
	}
	public String getLineNum() {
		return lineNum;
	}
	public void setLineNum(String lineNum) {
		this.lineNum = lineNum;
	}
	public String getPoType() {
		return poType;
	}
	public void setPoType(String poType) {
		this.poType = poType;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getBillingAccount() {
		return billingAccount;
	}
	public void setBillingAccount(String billingAccount) {
		this.billingAccount = billingAccount;
	}
	public String getEndUser() {
		return endUser;
	}
	public void setEndUser(String endUser) {
		this.endUser = endUser;
	}
	public Date getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public String getPoNum() {
		return poNum;
	}
	public void setPoNum(String poNum) {
		this.poNum = poNum;
	}
	public String getSalesTeam() {
		return salesTeam;
	}
	public void setSalesTeam(String salesTeam) {
		this.salesTeam = salesTeam;
	}
	public String getHoldName() {
		return holdName;
	}
	public void setHoldName(String holdName) {
		this.holdName = holdName;
	}
	public String getHoldDescription() {
		return holdDescription;
	}
	public void setHoldDescription(String holdDescription) {
		this.holdDescription = holdDescription;
	}
	public String getAppliedBy() {
		return appliedBy;
	}
	public void setAppliedBy(String appliedBy) {
		this.appliedBy = appliedBy;
	}
	public Date getAppliedOn() {
		return appliedOn;
	}
	public void setAppliedOn(Date appliedOn) {
		this.appliedOn = appliedOn;
	}
	public String getAppliedComments() {
		return appliedComments;
	}
	public void setAppliedComments(String appliedComments) {
		this.appliedComments = appliedComments;
	}
	public String getReleasedBy() {
		return releasedBy;
	}
	public void setReleasedBy(String releasedBy) {
		this.releasedBy = releasedBy;
	}
	public Date getReleasedOn() {
		return releasedOn;
	}
	public void setReleasedOn(Date releasedOn) {
		this.releasedOn = releasedOn;
	}
	public String getReleaseComments() {
		return releaseComments;
	}
	public void setReleaseComments(String releaseComments) {
		this.releaseComments = releaseComments;
	}
	public String getReleaseReason() {
		return releaseReason;
	}
	public void setReleaseReason(String releaseReason) {
		this.releaseReason = releaseReason;
	}
	public String getReleasingRole() {
		return releasingRole;
	}
	public void setReleasingRole(String releasingRole) {
		this.releasingRole = releasingRole;
	}
	public String getHoldLevel() {
		return holdLevel;
	}
	public void setHoldLevel(String holdLevel) {
		this.holdLevel = holdLevel;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
}
