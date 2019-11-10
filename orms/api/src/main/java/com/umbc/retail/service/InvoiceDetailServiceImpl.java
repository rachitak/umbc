package com.umbc.retail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.dao.InvoiceDetailDataDao;
import com.umbc.retail.entity.InvoiceDetailEntity;

@Service
public class InvoiceDetailServiceImpl implements InvoiceDetailService {

	@Autowired
	InvoiceDetailDataDao invoiceDetailDataDao;
	
	public List<InvoiceDetailEntity>  getInvoiceDetailById(Integer invoiceId) throws Exception {
		List<InvoiceDetailEntity>  invoiceDetailRec = new ArrayList<InvoiceDetailEntity>  ();
		try {
			invoiceDetailRec  = invoiceDetailDataDao. getInvoiceDetailById(invoiceId);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return invoiceDetailRec;
	}
	
}
