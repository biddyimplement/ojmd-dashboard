/**
 * 
 */
package com.deloitte.dell.jacquery.service;

import java.util.List;

import com.deloitte.dell.jacquery.model.OrderLineExtract;

/**
 * @author abadami
 *
 */
public interface OrderLineExtractService {
	
	public List<OrderLineExtract> getAllOrderLineExtracts();
	public OrderLineExtract getOrderLineExtractById(String salesOrderNum);
	void initialize();
	
}