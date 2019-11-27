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

import com.umbc.retail.entity.CustomerEntity;
import com.umbc.retail.entity.DepartmentEntity;
import com.umbc.retail.entity.ItemEntity;
import com.umbc.retail.entity.StoreEntity;
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
	 * 
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
	@RequestMapping(value = "/departments", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<DepartmentEntity> updateDepartmentById(
    		@RequestBody DepartmentEntity request ) throws Exception{
		
		
        return new ResponseEntity<DepartmentEntity> (departmentService.insertDepartmentById(request),HttpStatus.OK);
    }
	
	/*
	 * API for customer table
	 */
	@RequestMapping(value = "/customers", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<CustomerEntity> updateCustomerById(    		
    		@RequestBody CustomerEntity request ) throws Exception{
		
        return new ResponseEntity<CustomerEntity> (customerService.insertCustomerById(request),HttpStatus.OK);

		
    }
	
	/*
	 * API for item table
	 */
	@RequestMapping(value = "/items",method = RequestMethod.POST,produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ItemEntity> updateItemById(
			@RequestBody ItemEntity request ) throws Exception{
		
        return new ResponseEntity<ItemEntity> (itemService.insertItemById(request),HttpStatus.OK);
		
    }
	
	/*
	 * API for store table
	 */
	@RequestMapping(value = "/stores",method = RequestMethod.POST,produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StoreEntity> updateStoreById(
			@RequestBody StoreEntity request ) throws Exception{
		
        return new ResponseEntity<StoreEntity> (storeService.insertStoreById(request),HttpStatus.OK);
		
    }
}
