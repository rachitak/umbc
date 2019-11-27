package com.umbc.retail.dao;

import java.util.Optional;

import com.umbc.retail.entity.StoreEntity;

public interface StoreDataDao {
	Optional<StoreEntity> getStoreById (Integer storeID);
	
	StoreEntity insertStoreById(StoreEntity storeEntity);

}
