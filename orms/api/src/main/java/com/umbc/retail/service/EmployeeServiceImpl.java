package com.umbc.retail.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.EmployeeDataDao;
import com.umbc.retail.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDataDao employeeDataDao;
	
	@Override
	public EmployeeEntity getEmployeeById(Integer employeeId) throws Exception {
		EmployeeEntity empRec = new EmployeeEntity();
		try {
			empRec = employeeDataDao.getEmployeeById(employeeId).get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return empRec;
	}

	@Override
	public List<EmployeeEntity> getEmployees() throws Exception {
		List<EmployeeEntity> empRecList = new ArrayList<EmployeeEntity>();
		try {
			empRecList = employeeDataDao.getEmployees();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return empRecList;
	}

}
