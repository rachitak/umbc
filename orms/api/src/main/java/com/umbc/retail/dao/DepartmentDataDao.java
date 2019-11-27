package com.umbc.retail.dao;

import java.util.List;
import java.util.Optional;

import com.umbc.retail.entity.DepartmentEntity;


public interface DepartmentDataDao {
	
	Optional<DepartmentEntity> getDepartmentById (Integer departmentID);
	List<DepartmentEntity> getDepartments();
	
	DepartmentEntity updateDepartmentById(DepartmentEntity departmentEntity);
	DepartmentEntity insertDepartmentById(DepartmentEntity departmentEntity);
	
}
