package com.umbc.retail.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.entity.InvoiceDetailEntity;
import com.umbc.retail.entity.InvoiceMasterEntity;
import com.umbc.retail.repository.InvoiceDetailRepository;

@Service

public class InvoiceDetailDataDaoImpl implements InvoiceDetailDataDao {

	@Autowired
	InvoiceDetailRepository invoiceDetailRep;
	
	@Override
	public List<InvoiceDetailEntity> getInvoiceDetailById(Integer invoiceId) {
		
		return invoiceDetailRep.getInvoiceDetailById(invoiceId);
		
		
	}
	
	@Override
	public List<InvoiceDetailEntity> insertInvoiceDetailById(List<InvoiceDetailEntity> invDetailEntity) {
		return invoiceDetailRep.saveAll(invDetailEntity) ;
	}
	

}
