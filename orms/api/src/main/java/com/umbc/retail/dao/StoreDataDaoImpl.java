package com.umbc.retail.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.umbc.retail.entity.StoreEntity;
import com.umbc.retail.repository.StoreRepository;

@Service
public class StoreDataDaoImpl implements StoreDataDao {

	@Autowired
	StoreRepository storeRep;
	
	@Override
	public Optional<StoreEntity> getStoreById(Integer storeID) {
		return storeRep.findById(storeID);
	}

}
