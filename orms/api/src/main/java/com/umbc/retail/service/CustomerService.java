package com.umbc.retail.service;

import java.util.List;

import com.umbc.retail.entity.CustomerEntity;
import com.umbc.retail.repository.CustomerRepository.CustInfo;


public interface CustomerService {
	CustomerEntity getCustomerById (Integer custID) throws Exception;
	List<CustomerEntity> getCustomers() throws Exception;
	
	//to update customers
	CustomerEntity updateCustomerById(Integer customerId,CustomerEntity customerEntity) throws Exception ;
	CustomerEntity insertCustomerById(CustomerEntity customerEntity) throws Exception ;
	
	List<CustInfo> getCustomerInfo() throws Exception;
}
