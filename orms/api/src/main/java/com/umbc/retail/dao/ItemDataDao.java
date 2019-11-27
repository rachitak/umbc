package com.umbc.retail.dao;

import java.util.List;
import java.util.Optional;

import com.umbc.retail.entity.ItemEntity;


public interface ItemDataDao {
	Optional<ItemEntity> getItemById (Integer itemID);
	List<ItemEntity> getItemsByDepartmentId (Integer departmentId);
	List<ItemEntity> getItems();
	
	//update method
	ItemEntity updateItemById(ItemEntity itemEntity);
	ItemEntity insertItemById(ItemEntity itemEntity);
}
