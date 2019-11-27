package com.umbc.retail.service;

import com.umbc.retail.entity.StoreEntity;

public interface StoreService {
	StoreEntity getStoreById (Integer storeID) throws Exception;
	
	StoreEntity insertStoreById(StoreEntity storeEntity) throws Exception ;

}
