package com.umbc.retail.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.entity.TaxRateEntity;
import com.umbc.retail.repository.TaxRateRepository;

@Service
public class TaxRateDataDaoImpl implements TaxRateDataDao {

	@Autowired
	TaxRateRepository taxRateRep;
	
	@Override
	public Optional<TaxRateEntity> getTaxRateById(Integer taxID) {
		return taxRateRep.findById(taxID);
	}

}
