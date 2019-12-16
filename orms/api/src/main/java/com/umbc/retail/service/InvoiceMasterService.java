package com.umbc.retail.service;

import com.umbc.retail.entity.InvoiceMasterEntity;

public interface InvoiceMasterService {
	
	InvoiceMasterEntity getInvoiceMasterById (Integer invoiceID) throws Exception;
	InvoiceMasterEntity insertInvoiceMasterById (InvoiceMasterEntity invEntity) throws Exception;
	
}
