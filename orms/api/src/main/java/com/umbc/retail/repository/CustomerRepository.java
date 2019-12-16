package com.umbc.retail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.umbc.retail.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

	@Query(value = "select cust_id as custId,first_name as firstName from customer", nativeQuery = true)
	List<CustInfo> getCustomerInfo();
	
	
	interface CustInfo{
		Integer getCustId();
		String getFirstName();
	};
			
	
}
