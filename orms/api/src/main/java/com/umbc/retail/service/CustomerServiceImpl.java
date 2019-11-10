package com.umbc.retail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.CustomerDataDao;
import com.umbc.retail.entity.CustomerEntity;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDataDao customerDataDao;
	

	@Override
	public CustomerEntity getCustomerById(Integer custID) throws Exception {
		CustomerEntity custRec = new CustomerEntity();
		try {
			custRec  = customerDataDao.getCustomerById(custID).get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return custRec ;
	}

	@Override
	public List<CustomerEntity> getCustomers() throws Exception {
		List<CustomerEntity> custRecList = new ArrayList<CustomerEntity>();
		try {
			custRecList  = customerDataDao.getCustomers();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return custRecList ;
	}
}
