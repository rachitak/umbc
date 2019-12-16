package com.umbc.retail.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.umbc.retail.composite.InvoiceDetailKey;



public class InvoiceDetail {

	
	private Integer invoiceID;
	private Integer itemID;
	private Integer price;
	private Integer totalAmount;
	private Integer quantity;
	public InvoiceDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvoiceDetail(Integer invoiceID, Integer itemID, Integer price, Integer totalAmount, Integer quantity) {
		super();
		this.invoiceID = invoiceID;
		this.itemID = itemID;
		this.price = price;
		this.totalAmount = totalAmount;
		this.quantity = quantity;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}
