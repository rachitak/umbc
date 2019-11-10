package com.umbc.retail.composite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvoiceDetailKey implements Serializable {

	@Column(name="INVOICE_ID")
	private Integer invoiceID;
	
	@Column(name="ITEM_ID")
	private Integer itemID;

	public InvoiceDetailKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceDetailKey(Integer invoiceID, Integer itemID) {
		super();
		this.invoiceID = invoiceID;
		this.itemID = itemID;
	}

	public Integer getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(Integer invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	
}
