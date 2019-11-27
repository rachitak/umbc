package com.umbc.retail.dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.umbc.retail.entity.ItemEntity;
import com.umbc.retail.repository.ItemRepository;

@Service
public class ItemDataDaoImpl implements ItemDataDao {

	@Autowired
	ItemRepository itemRep;
	
	@Override
	public Optional<ItemEntity> getItemById(Integer itemID) {
		return itemRep.findById(itemID);
	}

	@Override
	public List<ItemEntity> getItemsByDepartmentId(Integer departmentId) {
		return itemRep.getItemsByDepartmentId(departmentId);
	}

	@Override
	public List<ItemEntity> getItems() {
		return itemRep.findAll();
	}

	@Override
	public ItemEntity updateItemById(ItemEntity itemEntity) {
		return itemRep.save(itemEntity);
	}
	
	@Override
	public ItemEntity insertItemById(ItemEntity itemEntity) {
		return itemRep.save(itemEntity);
	}

}
