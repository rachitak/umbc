package com.umbc.retail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class ItemEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ITEM_ID")
	private Integer itemID;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="DEPARTMENT_ID")
	private Integer departmentID;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="QUANTITY")
	private Integer quantity;
	
	@Column(name="DESCRIPTION")
	private String desciption;

	public ItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemEntity(Integer itemID, String itemName, Integer departmentID, double price, Integer quantity,
			String desciption) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.departmentID = departmentID;
		this.price = price;
		this.quantity = quantity;
		this.desciption = desciption;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	
	

	
	
}
