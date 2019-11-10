package com.umbc.retail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.InvoiceMasterDataDao;
import com.umbc.retail.entity.InvoiceMasterEntity;

@Service
public class InvoiceMasterServiceImpl implements InvoiceMasterService {

	@Autowired
	InvoiceMasterDataDao invoiceMasterDataDao;
	
	@Override
	public InvoiceMasterEntity getInvoiceMasterById(Integer invoiceID) throws Exception {
		InvoiceMasterEntity invoiceMasterRec = new InvoiceMasterEntity();
		try {
			invoiceMasterRec  = invoiceMasterDataDao.getInvoiceMasterById(invoiceID).get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return invoiceMasterRec;
	}

}
