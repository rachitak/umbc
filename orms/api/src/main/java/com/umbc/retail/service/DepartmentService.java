package com.umbc.retail.service;

import java.util.List;

import com.umbc.retail.entity.DepartmentEntity;

public interface DepartmentService {
	DepartmentEntity getDepartmentById (Integer departmentID) throws Exception;
	List<DepartmentEntity> getDepartments() throws Exception;
	
	//to update departments
	DepartmentEntity updateDepartmentById(Integer departmentId,DepartmentEntity departmentEntity) throws Exception ;
	DepartmentEntity insertDepartmentById(Integer departmentId,DepartmentEntity departmentEntity) throws Exception ;
	
}
