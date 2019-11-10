package com.umbc.retail.service;

import java.util.List;

import com.umbc.retail.entity.InvoiceDetailEntity;

public interface InvoiceDetailService {

	List<InvoiceDetailEntity> getInvoiceDetailById (Integer invoiceId) throws Exception;

}
