package com.umbc.retail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.umbc.retail.composite.InvoiceDetailKey;
import com.umbc.retail.entity.InvoiceDetailEntity;

@Repository
public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetailEntity, InvoiceDetailKey> {

	@Query(
			value =  "SELECT "
					+ "		INVOICE_ID, "
					+ "		PRICE, "
					+ "		TOTAL_AMOUNT, "
					+ "		QUANTITY, "
					+ "		ITEM_ID "
					+ " FROM "
					+ "		INVOICE_DETAIL "
					+ " WHERE "
					+ "		INVOICE_ID =:invoiceId",nativeQuery = true)
	List<InvoiceDetailEntity> getInvoiceDetailById(@Param("invoiceId") Integer invoiceId);
}

