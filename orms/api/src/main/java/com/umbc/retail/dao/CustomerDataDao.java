package com.umbc.retail.dao;

import java.util.List;
import java.util.Optional;

import com.umbc.retail.entity.CustomerEntity;


public interface CustomerDataDao {

	Optional<CustomerEntity> getCustomerById (Integer custID);
	List<CustomerEntity> getCustomers();

	CustomerEntity updateCustomerById(CustomerEntity customerEntity);
	CustomerEntity insertCustomerById(CustomerEntity customerEntity);
}
