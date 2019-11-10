package com.umbc.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umbc.retail.entity.StoreEntity;

public interface StoreRepository extends JpaRepository<StoreEntity, Integer> {

}
