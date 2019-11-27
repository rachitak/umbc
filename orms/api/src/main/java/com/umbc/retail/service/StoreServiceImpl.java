package com.umbc.retail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.StoreDataDao;
import com.umbc.retail.entity.CustomerEntity;
import com.umbc.retail.entity.StoreEntity;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	StoreDataDao storeDataDao;
	
	@Override
	public StoreEntity getStoreById(Integer storeID) throws Exception {
		StoreEntity storeRec = new StoreEntity();
		try {
			storeRec = storeDataDao.getStoreById(storeID).get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return storeRec;
	}
	
	
	//to update Customer
	@Override
	public StoreEntity insertStoreById(StoreEntity storeEntity) throws Exception  {
		StoreEntity SEntity = new StoreEntity();
			try {
				SEntity  = storeDataDao.insertStoreById(storeEntity);
			}catch(Exception e) {
				throw new Exception(e.getMessage());
			}
			return SEntity;
		}
}
