package com.umbc.retail.service;

import com.umbc.retail.entity.TaxRateEntity;

public interface TaxRateService {
	TaxRateEntity getTaxRateById (Integer taxID) throws Exception;

}
