package com.umbc.retail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.ItemDataDao;
import com.umbc.retail.entity.ItemEntity;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDataDao itemDataDao;
	
	@Override
	public ItemEntity getItemById(Integer itemID) throws Exception {
		ItemEntity  itemRec = new ItemEntity ();
		try {
			itemRec  = itemDataDao.getItemById(itemID).get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return itemRec ;
	}
	

	@Override
	public List<ItemEntity> getItemsByDepartmentId(Integer departmentID) throws Exception {
		List<ItemEntity> itemDeptRec = new ArrayList<ItemEntity>();
		try {
			itemDeptRec  = itemDataDao.getItemsByDepartmentId(departmentID);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return itemDeptRec ;
	}


	@Override
	public List<ItemEntity> getItems() throws Exception {
		List<ItemEntity> itemRecList = new ArrayList<ItemEntity>();
		try {
			itemRecList = itemDataDao.getItems();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return itemRecList;
	}


	@Override
	public ItemEntity updateItemById(Integer itemID, ItemEntity itemEntity) {
		return itemDataDao.updateItemById(itemEntity);
	}


}
