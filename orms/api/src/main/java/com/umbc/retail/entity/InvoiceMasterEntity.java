package com.umbc.retail.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INVOICE_MASTER")
public class InvoiceMasterEntity {

	@Id
	@Column(name="INVOICE_ID")
	private Integer invoiceID;
	
	@Column(name="INVOICE_DATE")
	private LocalDate invoiceDate;
	
	@Column(name="CUST_ID")
	private Integer custID;
	
	@Column(name="SUBTOTAL")
	private double subtotal;
	
	@Column(name="STATE_TAX")
	private double stateTax;
	
	@Column(name="FEDERAL_TAX")
	private double federalTax;
	
	@Column(name="TOTAL_AMOUNT")
	private double totalAmount;

	public InvoiceMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceMasterEntity(Integer invoiceID, LocalDate invoiceDate, Integer custID, double subtotal,
			double stateTax, double federalTax, double totalAmount) {
		super();
		this.invoiceID = invoiceID;
		this.invoiceDate = invoiceDate;
		this.custID = custID;
		this.subtotal = subtotal;
		this.stateTax = stateTax;
		this.federalTax = federalTax;
		this.totalAmount = totalAmount;
	}

	public Integer getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(Integer invoiceID) {
		this.invoiceID = invoiceID;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Integer getCustID() {
		return custID;
	}

	public void setCustID(Integer custID) {
		this.custID = custID;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getStateTax() {
		return stateTax;
	}

	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}

	public double getFederalTax() {
		return federalTax;
	}

	public void setFederalTax(double federalTax) {
		this.federalTax = federalTax;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
