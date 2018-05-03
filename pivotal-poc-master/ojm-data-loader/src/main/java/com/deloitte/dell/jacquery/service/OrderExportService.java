/**
 * 
 */
package com.deloitte.dell.jacquery.service;

import java.util.List;

import com.deloitte.dell.jacquery.model.OrderExport;

/**
 * @author abadami
 *
 */
public interface OrderExportService {
	
	public List<OrderExport> getAllOrderExports();
	public OrderExport getOrderExportById(String salesOrderNum);
	
	void initialize();
	
}