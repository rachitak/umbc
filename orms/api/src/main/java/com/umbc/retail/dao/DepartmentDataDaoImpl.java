package com.umbc.retail.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.umbc.retail.entity.DepartmentEntity;
import com.umbc.retail.repository.DepartmentRepository;

@Service
public class DepartmentDataDaoImpl implements DepartmentDataDao {

	@Autowired
	DepartmentRepository departmentRep;
	
	@Override
	public Optional<DepartmentEntity> getDepartmentById(Integer departmentID) {
		return departmentRep.findById(departmentID);
	}

	@Override
	public List<DepartmentEntity> getDepartments() {
		return departmentRep.findAll();
	}

	@Override
	public DepartmentEntity updateDepartmentById(DepartmentEntity departmentEntity) {
		
		return departmentRep.save(departmentEntity);
	}

	@Override
	public DepartmentEntity insertDepartmentById(DepartmentEntity departmentEntity) {
		
		return departmentRep.save(departmentEntity);
	}
}
