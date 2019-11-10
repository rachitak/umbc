package com.umbc.retail.service;

import java.util.List;

import com.umbc.retail.entity.CustomerEntity;


public interface CustomerService {
	CustomerEntity getCustomerById (Integer custID) throws Exception;
	List<CustomerEntity> getCustomers() throws Exception;
}
