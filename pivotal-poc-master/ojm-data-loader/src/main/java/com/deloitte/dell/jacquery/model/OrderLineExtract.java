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
@Entity(name="order_line_extract")
public class OrderLineExtract {


	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;

	@CsvBindByName(column = "Sequence #")
	@Column(name="sequence_num")
	private	String	sequenceNum;

	@Column(name="sku")
	@CsvBindByName(column = "SKU")
	private	String	sku;

	@Column(name="product_description")
	@CsvBindByName(column = "Product Description")
	private	String	productDescription;

	@Column(name="qty")
	@CsvBindByName(column = "Qty")
	private	String	qty;

	@Column(name="gsa_compliant")
	@CsvBindByName(column = "GSA Compliant")
	private	String	gsaCompliant;

	@Column(name="taa_compliant")
	@CsvBindByName(column = "TAA Compliant")
	private	String	taaCompliant;

	@Column(name="gsa_override")
	@CsvBindByName(column = "GSA Override")
	private	String	gsaOverride;

	@Column(name="taa_override")
	@CsvBindByName(column = "TAA Override")
	private	String	taaOverride;

	@Column(name="valid")
	@CsvBindByName(column = "Valid")
	private	String	valid;

	@Column(name="accepted")
	@CsvBindByName(column = "Accepted?")
	private	String	accepted;

	@Column(name="edd")
	@CsvBindByName(column = "EDD")
	private	String	edd;

	@Column(name="contract_price")	
	@CsvBindByName(column = "Contract Price")
	private	String	contractPrice;

	@Column(name="off_contract")	
	@CsvBindByName(column = "Off Contract?")
	private	String	offContract;

	@Column(name="invoiced")
	@CsvBindByName(column = "Invoiced?")
	private	String	invoiced;

	@Column(name="net_price")
	@CsvBindByName(column = "Net Price")
	private	String	netPrice;

	@Column(name="contract_dol")
	@CsvBindByName(column = "Contract DOL")
	private	String	contractDOL;

	@Column(name="manual_dol")
	@CsvBindByName(column = "Manual DOL")
	private	String	manualDOL;

	@Column(name="discount_class_code")
	@CsvBindByName(column = "Discount Class Code")
	private	String	discountClassCode;

	@Column(name="extended_qty")
	@CsvBindByName(column = "Extended Qty")
	private	String	extendedQty;

	@Column(name="extended_price")
	@CsvBindByName(column = "Extended Price")
	private	String	extendedPrice;

	@Column(name="line_total")
	@CsvBindByName(column = "Line Total")
	private	String	lineTotal;

	@Column(name="status")
	@CsvBindByName(column = "Status")
	private	String	status;

	@Column(name="fulfillment_status")
	@CsvBindByName(column = "Fulfillment Status")
	private	String	fulfillmentStatus;

	@Column(name="fulfillment_order_num")
	@CsvBindByName(column = "Fulfillment Order #")
	private	String	fulfillmentOrderNum;

	@Column(name="cancelled_by")
	@CsvBindByName(column = "Cancelled By")
	private	String	cancelledBy;

	@Column(name="cancellation_reason")
	@CsvBindByName(column = "Cancellation Reason")
	private	String	cancellationReason;

	@Column(name="si_number")
	@CsvBindByName(column = "SI Number")
	private	String	siNumber;

	@Column(name="cancellation_description")
	@CsvBindByName(column = "Cancellation Description")
	private	String	cancellationDescription;

	@Column(name="service_tag_num")
	@CsvBindByName(column = "Service Tag #")
	private	String	serviceTagNum;

	@Column(name="start_date")
	@CsvBindByName(column = "Start Date")
	@Temporal(TemporalType.DATE)
	@CsvDate("MM/dd/yyyy hh:mm")
	private	Date startDate;
	
	@Column(name="expiration_date")
	@CsvBindByName(column = "Expiration Date")
	@Temporal(TemporalType.DATE)
	@CsvDate("MM/dd/yyyy hh:mm")
	private	Date	expirationDate;

	@Column(name="hold")
	@CsvBindByName(column = "Hold")
	private	String	hold;

	@Column(name="validation_comments")
	@CsvBindByName(column = "Validation Comments")
	private	String	validationComments;

	@Column(name="comments")
	@CsvBindByName(column = "Comments")
	private	String	comments;

	@Column(name="shipping_charge")
	@CsvBindByName(column = "Shipping Charge")
	private	String	shippingCharge;

	@Column(name="tax")
	@CsvBindByName(column = "Tax")
	private	String	tax;

	@Column(name="sef")
	@CsvBindByName(column = "SEF")
	private	String	sef;

	@Column(name="mabd")
	@CsvBindByName(column = "MABD")
	private	String	mabd;

	@Column(name="cost_price")
	@CsvBindByName(column = "Cost Price")
	private	String	costPrice;

	@Column(name="shipping")
	@CsvBindByName(column = "Shipping")
	private	String	shipping;

	public String getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(String sequenceNum) {
		this.sequenceNum = sequenceNum;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getGsaCompliant() {
		return gsaCompliant;
	}

	public void setGsaCompliant(String gsaCompliant) {
		this.gsaCompliant = gsaCompliant;
	}

	public String getTaaCompliant() {
		return taaCompliant;
	}

	public void setTaaCompliant(String taaCompliant) {
		this.taaCompliant = taaCompliant;
	}

	public String getGsaOverride() {
		return gsaOverride;
	}

	public void setGsaOverride(String gsaOverride) {
		this.gsaOverride = gsaOverride;
	}

	public String getTaaOverride() {
		return taaOverride;
	}

	public void setTaaOverride(String taaOverride) {
		this.taaOverride = taaOverride;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getAccepted() {
		return accepted;
	}

	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}

	public String getEdd() {
		return edd;
	}

	public void setEdd(String edd) {
		this.edd = edd;
	}

	public String getContractPrice() {
		return contractPrice;
	}

	public void setContractPrice(String contractPrice) {
		this.contractPrice = contractPrice;
	}

	public String getOffContract() {
		return offContract;
	}

	public void setOffContract(String offContract) {
		this.offContract = offContract;
	}

	public String getInvoiced() {
		return invoiced;
	}

	public void setInvoiced(String invoiced) {
		this.invoiced = invoiced;
	}

	public String getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(String netPrice) {
		this.netPrice = netPrice;
	}

	public String getContractDOL() {
		return contractDOL;
	}

	public void setContractDOL(String contractDOL) {
		this.contractDOL = contractDOL;
	}

	public String getManualDOL() {
		return manualDOL;
	}

	public void setManualDOL(String manualDOL) {
		this.manualDOL = manualDOL;
	}

	public String getDiscountClassCode() {
		return discountClassCode;
	}

	public void setDiscountClassCode(String discountClassCode) {
		this.discountClassCode = discountClassCode;
	}

	public String getExtendedQty() {
		return extendedQty;
	}

	public void setExtendedQty(String extendedQty) {
		this.extendedQty = extendedQty;
	}

	public String getExtendedPrice() {
		return extendedPrice;
	}

	public void setExtendedPrice(String extendedPrice) {
		this.extendedPrice = extendedPrice;
	}

	public String getLineTotal() {
		return lineTotal;
	}

	public void setLineTotal(String lineTotal) {
		this.lineTotal = lineTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getFulfillmentOrderNum() {
		return fulfillmentOrderNum;
	}

	public void setFulfillmentOrderNum(String fulfillmentOrderNum) {
		this.fulfillmentOrderNum = fulfillmentOrderNum;
	}

	public String getCancelledBy() {
		return cancelledBy;
	}

	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public String getSiNumber() {
		return siNumber;
	}

	public void setSiNumber(String siNumber) {
		this.siNumber = siNumber;
	}

	public String getCancellationDescription() {
		return cancellationDescription;
	}

	public void setCancellationDescription(String cancellationDescription) {
		this.cancellationDescription = cancellationDescription;
	}

	public String getServiceTagNum() {
		return serviceTagNum;
	}

	public void setServiceTagNum(String serviceTagNum) {
		this.serviceTagNum = serviceTagNum;
	}

	public String getHold() {
		return hold;
	}

	public void setHold(String hold) {
		this.hold = hold;
	}

	public String getValidationComments() {
		return validationComments;
	}

	public void setValidationComments(String validationComments) {
		this.validationComments = validationComments;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(String shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getSef() {
		return sef;
	}

	public void setSef(String sef) {
		this.sef = sef;
	}

	public String getMabd() {
		return mabd;
	}

	public void setMabd(String mabd) {
		this.mabd = mabd;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
