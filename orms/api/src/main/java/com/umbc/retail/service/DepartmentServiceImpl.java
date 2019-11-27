package com.umbc.retail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.DepartmentDataDao;
import com.umbc.retail.entity.DepartmentEntity;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDataDao departmentDataDao;
	

	@Override
	public DepartmentEntity getDepartmentById(Integer departmentID) throws Exception {
		DepartmentEntity depRec = new DepartmentEntity();
		try {
			depRec  = departmentDataDao.getDepartmentById(departmentID).get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return depRec;
	}

	@Override
	public List<DepartmentEntity> getDepartments() throws Exception {
		List<DepartmentEntity> depRecList = new ArrayList<DepartmentEntity>();
		try {
			depRecList = departmentDataDao.getDepartments();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return depRecList;
	}

	//to update departments
	@Override
	public DepartmentEntity updateDepartmentById(Integer departmentId,DepartmentEntity departmentEntity) throws Exception  {
		DepartmentEntity deptEntity = new DepartmentEntity();
		try {
			deptEntity  = departmentDataDao.updateDepartmentById(departmentEntity);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return deptEntity;
	}
	
	//to update departments
	@Override
	public DepartmentEntity insertDepartmentById(DepartmentEntity departmentEntity) throws Exception  {
			DepartmentEntity res = new DepartmentEntity();
			try {
				res  = departmentDataDao.insertDepartmentById(departmentEntity);
			}catch(Exception e) {
				throw new Exception(e.getMessage());
			}
			return res;
		}
}
