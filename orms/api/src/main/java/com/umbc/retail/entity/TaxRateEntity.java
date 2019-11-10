package com.umbc.retail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAX_RATE")
public class TaxRateEntity {

	@Id
	@Column(name="TAX_ID")
	private Integer taxID;
	
	@Column(name="STATE_TAX")
	private double stateTax;
	
	@Column(name="FEDERAL_TAX")
	private double federalTax;

	public TaxRateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaxRateEntity(Integer taxID, double stateTax, double federalTax) {
		super();
		this.taxID = taxID;
		this.stateTax = stateTax;
		this.federalTax = federalTax;
	}

	public Integer getTaxID() {
		return taxID;
	}

	public void setTaxID(Integer taxID) {
		this.taxID = taxID;
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

}
