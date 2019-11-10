package com.umbc.retail.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.entity.EmployeeEntity;
import com.umbc.retail.repository.EmployeeRepository;

@Service
public class EmployeeDataDaoImpl implements EmployeeDataDao {

	@Autowired
	EmployeeRepository empRep;

	@Override
	public Optional<EmployeeEntity> getEmployeeById(Integer employeeId) {
		return empRep.findById(employeeId);
	}

	@Override
	public List<EmployeeEntity> getEmployees() {
		return empRep.findAll();
	}
	
}
