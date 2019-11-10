package com.umbc.retail.service;

import java.util.List;
import java.util.Optional;

import com.umbc.retail.entity.EmployeeEntity;

public interface EmployeeService {
	EmployeeEntity getEmployeeById (Integer employeeId) throws Exception;
	List<EmployeeEntity> getEmployees() throws Exception;
}
