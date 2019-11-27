package com.umbc.retail.dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.entity.CustomerEntity;
import com.umbc.retail.entity.DepartmentEntity;
import com.umbc.retail.repository.CustomerRepository;

@Service
public class CustomerDataDaoImpl implements CustomerDataDao {

	@Autowired
	CustomerRepository custRep;
	
	@Override
	public Optional<CustomerEntity> getCustomerById(Integer custID) {
		return custRep.findById(custID);
	}

	@Override
	public List<CustomerEntity> getCustomers() {
		return custRep.findAll();
	}
	
	@Override
	public CustomerEntity updateCustomerById(CustomerEntity customerEntity) {
		
		return custRep.save(customerEntity);
	}

	@Override
	public CustomerEntity insertCustomerById(CustomerEntity customerEntity) {
		
		return custRep.save(customerEntity);
	}

}
