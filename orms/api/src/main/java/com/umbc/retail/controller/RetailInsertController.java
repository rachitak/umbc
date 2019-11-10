package com.umbc.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umbc.retail.entity.DepartmentEntity;
import com.umbc.retail.service.CustomerService;
import com.umbc.retail.service.DepartmentService;
import com.umbc.retail.service.EmployeeService;
import com.umbc.retail.service.ItemService;
import com.umbc.retail.service.StoreService;
import com.umbc.retail.service.TaxRateService;

@CrossOrigin
@RestController
public class RetailInsertController {
	/*
	 * Rachita
	 */
	@Autowired
	EmployeeService empService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	StoreService storeService;
	
	@Autowired
	TaxRateService taxRateService;
	
	@Autowired
	ItemService itemService;
	
	
	
	
	
	/*
	 * API for department table
	 */
	@RequestMapping(value = "/departments/{departmentID}", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<DepartmentEntity> updateDepartmentById(
    		@PathVariable(name="departmentID") Integer departmentID,
    		@RequestBody DepartmentEntity request ) throws Exception{
		
		
        return new ResponseEntity<DepartmentEntity> (departmentService.insertDepartmentById(departmentID,request),HttpStatus.OK);
    }
	
	
	
}
