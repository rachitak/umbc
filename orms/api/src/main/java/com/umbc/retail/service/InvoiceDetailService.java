package com.umbc.retail.service;

import java.util.List;

import com.umbc.retail.entity.InvoiceDetail;
import com.umbc.retail.entity.InvoiceDetailEntity;

public interface InvoiceDetailService {

	List<InvoiceDetailEntity> getInvoiceDetailById (Integer invoiceId) throws Exception;
	List<InvoiceDetailEntity> insertInvoiceDetailById (List<InvoiceDetail> invDetail) throws Exception;
	
}
