package com.umbc.retail.service;

import java.util.List;
import com.umbc.retail.entity.ItemEntity;

public interface ItemService {
	ItemEntity getItemById (Integer itemID) throws Exception;
	List<ItemEntity> getItemsByDepartmentId (Integer departmentID) throws Exception;
	List<ItemEntity> getItems() throws Exception;
	
	ItemEntity updateItemById(Integer itemID, ItemEntity itemEntity);
}
