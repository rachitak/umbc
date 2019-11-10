package com.umbc.retail.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.umbc.retail.composite.InvoiceDetailKey;

@Entity
@Table(name="INVOICE_DETAIL")
public class InvoiceDetailEntity {

	
	@EmbeddedId
	InvoiceDetailKey Id;
	
	@Column(name="PRICE")
	private Integer price;
	
	@Column(name="TOTAL_AMOUNT")
	private Integer totalAmount;
	
	@Column(name="QUANTITY")
	private Integer quantity;

	public InvoiceDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceDetailEntity(InvoiceDetailKey id, Integer price, Integer totalAmount, Integer quantity) {
		super();
		Id = id;
		this.price = price;
		this.totalAmount = totalAmount;
		this.quantity = quantity;
	}

	public InvoiceDetailKey getId() {
		return Id;
	}

	public void setId(InvoiceDetailKey id) {
		Id = id;
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
