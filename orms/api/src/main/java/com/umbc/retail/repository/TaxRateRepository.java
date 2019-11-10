package com.umbc.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umbc.retail.entity.TaxRateEntity;

@Repository
public interface TaxRateRepository extends JpaRepository<TaxRateEntity, Integer> {

}
