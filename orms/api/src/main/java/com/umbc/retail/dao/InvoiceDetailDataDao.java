package com.umbc.retail.dao;

import java.util.List;

import com.umbc.retail.entity.InvoiceDetailEntity;

public interface InvoiceDetailDataDao {

	List<InvoiceDetailEntity> getInvoiceDetailById (Integer invoiceId);
	List<InvoiceDetailEntity> insertInvoiceDetailById (List<InvoiceDetailEntity> invDetailEntity);

}
