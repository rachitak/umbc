package com.umbc.retail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umbc.retail.entity.CustomerEntity;
import com.umbc.retail.entity.DepartmentEntity;
import com.umbc.retail.entity.EmployeeEntity;
import com.umbc.retail.entity.InvoiceDetailEntity;
import com.umbc.retail.entity.InvoiceMasterEntity;
import com.umbc.retail.entity.ItemEntity;
import com.umbc.retail.entity.StoreEntity;
import com.umbc.retail.entity.TaxRateEntity;
import com.umbc.retail.service.CustomerService;
import com.umbc.retail.service.DepartmentService;
import com.umbc.retail.service.EmployeeService;
import com.umbc.retail.service.InvoiceDetailService;
import com.umbc.retail.service.InvoiceMasterService;
import com.umbc.retail.service.ItemService;
import com.umbc.retail.service.StoreService;
import com.umbc.retail.service.TaxRateService;

@CrossOrigin
@RestController
public class RetailRetrieveController {

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
	 * API for Employees table
	 */
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeEntity>> retrieveAllEmployees() throws Exception{
        return new ResponseEntity<List<EmployeeEntity>> (empService.getEmployees(),HttpStatus.OK);
    }
	
	
	@RequestMapping(value = "/employees/{Id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeEntity> retrieveAllEmployeById(
    		@PathVariable(name="Id") Integer Id
    		
    		
    		) throws Exception{
        return new ResponseEntity<EmployeeEntity> (empService.getEmployeeById(Id),HttpStatus.OK);
    }
	
	

	/*
	 * API for customer table
	 */
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerEntity>> retrieveAllCustomers() throws Exception{
        return new ResponseEntity<List<CustomerEntity>> (customerService.getCustomers(),HttpStatus.OK);
    }
	
	
	@RequestMapping(value = "/customers/{custID}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerEntity> retrieveAllCustomersById(
    		@PathVariable(name="custID") Integer custID) throws Exception{
        return new ResponseEntity<CustomerEntity> (customerService.getCustomerById(custID),HttpStatus.OK);
    }
	
	
	/*
	 * API for department table
	 */
	@RequestMapping(value = "/departments/{departmentID}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DepartmentEntity> retrieveAllDepartmentsById(
    		@PathVariable(name="departmentID") Integer departmentID) throws Exception{
        return new ResponseEntity<DepartmentEntity> (departmentService.getDepartmentById(departmentID),HttpStatus.OK);
    }
	
	@RequestMapping(value = "/departments", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DepartmentEntity>> retrieveAllDepartments() throws Exception{
        return new ResponseEntity<List<DepartmentEntity>> (departmentService.getDepartments(),HttpStatus.OK);
    }
	
	/*
	 * api for store table.
	 */
	
	@RequestMapping(value = "/stores/{storeID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StoreEntity> retrieveAllStoressById(@PathVariable(name = "storeID") Integer storeID) throws Exception {
		return new ResponseEntity<StoreEntity>(storeService.getStoreById(storeID), HttpStatus.OK);
	}
	
	/*
	 * api for tax rate
	 */
	
	
	@RequestMapping(value = "/taxRate/{taxID}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TaxRateEntity> retrieveAllTaxRateById(
    		@PathVariable(name="taxID") Integer taxID) throws Exception{
        return new ResponseEntity<TaxRateEntity> (taxRateService.getTaxRateById(taxID),HttpStatus.OK);
    }

	
	
	/*
	 * api for invoice master table 
	 */
	@Autowired
	InvoiceMasterService invoiceMasterService;
	
	@RequestMapping(value = "/invoiceMaster/{invoiceID}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InvoiceMasterEntity> retrieveAllInvoiceMasterById(@PathVariable(name="invoiceID") Integer invoiceID) throws Exception{
        return new ResponseEntity<InvoiceMasterEntity> (invoiceMasterService.getInvoiceMasterById(invoiceID),HttpStatus.OK);
    }

	/*
	 * api for items table
	 * 
	 * 
	 */
	
	@RequestMapping(value = "/items", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ItemEntity>> retrieveAllItemss() throws Exception{
        return new ResponseEntity<List<ItemEntity>> (itemService.getItems(),HttpStatus.OK);
    }

	
	@RequestMapping(value = "/items/{itemID}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemEntity> retrieveAllItems(
    		@PathVariable(name="itemID") Integer itemID
    		
    		
    		) throws Exception{
        return new ResponseEntity<ItemEntity> (itemService.getItemById(itemID),HttpStatus.OK);
    }
	
	@RequestMapping(value = "/items/department/{departmentID}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ItemEntity>> retrieveAllItemsById(
    		@PathVariable(name="departmentID") Integer departmentID
    		
    		
    		) throws Exception{
        return new ResponseEntity<List<ItemEntity>> (itemService.getItemsByDepartmentId(departmentID),HttpStatus.OK);
    }
	
	/*
	 * api for invoice detail table 
	 */
	@Autowired
	InvoiceDetailService invoiceDeatilService;
	
	@RequestMapping(value = "/invoiceDetail/{invoiceID}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InvoiceDetailEntity>> retrieveAllInvoiceDetailById(@PathVariable(name="invoiceID") Integer invoiceID) throws Exception{
        return new ResponseEntity<List<InvoiceDetailEntity>> (invoiceDeatilService.getInvoiceDetailById(invoiceID),HttpStatus.OK);
    }


}
