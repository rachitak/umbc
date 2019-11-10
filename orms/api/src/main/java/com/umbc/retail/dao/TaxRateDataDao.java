package com.umbc.retail.dao;

import java.util.Optional;

import com.umbc.retail.entity.TaxRateEntity;

public interface TaxRateDataDao {
	
	Optional<TaxRateEntity> getTaxRateById (Integer taxID);

}
