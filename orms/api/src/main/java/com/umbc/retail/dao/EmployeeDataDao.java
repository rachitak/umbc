package com.umbc.retail.dao;

import java.util.List;
import java.util.Optional;

import com.umbc.retail.entity.EmployeeEntity;

public interface EmployeeDataDao {

	Optional<EmployeeEntity> getEmployeeById (Integer employeeId);
	List<EmployeeEntity> getEmployees();
	
}

