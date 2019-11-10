package com.umbc.retail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.umbc.retail.entity.ItemEntity;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
	
	@Query(
			value =  "SELECT "
					+ "		ITEM_ID, "
					+ "		ITEM_NAME, "
					+ "		DEPARTMENT_ID, "
					+ "		PRICE, "
					+ "		QUANTITY, "
					+ "		DESCRIPTION "
					+ " FROM "
					+ "		ITEM "
					+ " WHERE "
					+ "		DEPARTMENT_ID =:departmentId",nativeQuery = true)
	List<ItemEntity> getItemsByDepartmentId(@Param("departmentId") Integer departmentId);
	
			
	
	
}
