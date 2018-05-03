/**
 * 
 */
package com.deloitte.dell.jacquery.service;

import java.util.List;

import com.deloitte.dell.jacquery.model.SalesOrderHold;

/**
 * @author abadami
 *
 */
public interface SalesOrderHoldService {
	
	public List<SalesOrderHold> getAllSalesOrderHolds();
	public SalesOrderHold getSalesOrderHoldById(String salesOrderNum);
	
	void initialize();
	
}