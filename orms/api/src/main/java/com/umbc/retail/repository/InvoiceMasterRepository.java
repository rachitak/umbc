package com.umbc.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umbc.retail.entity.InvoiceMasterEntity;

@Repository
public interface InvoiceMasterRepository extends JpaRepository<InvoiceMasterEntity, Integer> {

}
