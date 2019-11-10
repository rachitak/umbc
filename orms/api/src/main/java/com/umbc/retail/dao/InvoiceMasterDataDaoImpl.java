package com.umbc.retail.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.entity.InvoiceMasterEntity;
import com.umbc.retail.repository.InvoiceMasterRepository;
@Service
public class InvoiceMasterDataDaoImpl implements InvoiceMasterDataDao {

	@Autowired
	InvoiceMasterRepository invoiceMasterRep;
	
	@Override
	public Optional<InvoiceMasterEntity> getInvoiceMasterById(Integer invoiceID) {
		return invoiceMasterRep.findById(invoiceID);
	}

}
