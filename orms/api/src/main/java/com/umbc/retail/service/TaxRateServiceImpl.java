package com.umbc.retail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.TaxRateDataDao;
import com.umbc.retail.entity.TaxRateEntity;

@Service
public class TaxRateServiceImpl implements TaxRateService {

	@Autowired
	TaxRateDataDao taxRateDataDao;
	
	@Override
	public TaxRateEntity getTaxRateById(Integer taxID) throws Exception {
		TaxRateEntity taxRec = new TaxRateEntity();
		try {
			taxRec  = taxRateDataDao.getTaxRateById(taxID).get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return taxRec;
	}
}
