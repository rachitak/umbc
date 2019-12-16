package com.umbc.retail.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umbc.retail.composite.InvoiceDetailKey;
import com.umbc.retail.dao.InvoiceDetailDataDao;
import com.umbc.retail.entity.InvoiceDetail;
import com.umbc.retail.entity.InvoiceDetailEntity;

@Service
public class InvoiceDetailServiceImpl implements InvoiceDetailService {

	@Autowired
	InvoiceDetailDataDao invoiceDetailDataDao;
	
	@Override
	public List<InvoiceDetailEntity>  getInvoiceDetailById(Integer invoiceId) throws Exception {
		List<InvoiceDetailEntity>  invoiceDetailRec = new ArrayList<InvoiceDetailEntity>  ();
		try {
			invoiceDetailRec  = invoiceDetailDataDao. getInvoiceDetailById(invoiceId);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return invoiceDetailRec;
	}

	
	@Override
	public List<InvoiceDetailEntity>  insertInvoiceDetailById(List<InvoiceDetail> invDetail) throws Exception {
		List<InvoiceDetailEntity>  invoiceDetailRec = new ArrayList<InvoiceDetailEntity>  ();
		
		try {
			
			List<InvoiceDetailEntity> invRec = invDetail
					.stream()
					.map(indt->new InvoiceDetailEntity( new InvoiceDetailKey(indt.getInvoiceID(),indt.getItemID()),
							indt.getPrice(),indt.getTotalAmount(),indt.getQuantity()) )
					.collect(Collectors.toList());
					
					
			invoiceDetailRec  = invoiceDetailDataDao.insertInvoiceDetailById(invRec);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return invoiceDetailRec;
	}
	
	
	
	
}
