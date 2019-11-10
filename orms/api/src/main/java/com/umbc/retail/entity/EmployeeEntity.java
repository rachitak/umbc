package com.umbc.retail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@Column(name="id")
	private Integer id;
	
	
	@Column(name="emp_name")
	private String empName;


	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeEntity(Integer id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	
	
	
	
}
