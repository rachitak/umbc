package com.umbc.retail.dao;

import java.util.Optional;

import com.umbc.retail.entity.InvoiceMasterEntity;

public interface InvoiceMasterDataDao {

	Optional<InvoiceMasterEntity> getInvoiceMasterById (Integer invoiceID);
	InvoiceMasterEntity insertInvoiceMasterById (InvoiceMasterEntity invEntity);
	
}
