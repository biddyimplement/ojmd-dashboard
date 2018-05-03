/**
 * 
 */
package com.deloitte.dell.ojm.service;

import com.deloitte.dell.ojm.controller.DashboardController;
import com.deloitte.dell.ojm.model.OrderStatusDetails;
import com.deloitte.dell.ojm.model.Overview;
import com.deloitte.dell.ojm.model.Summary;

/**
 * @author abadami
 *
 */
public interface DashboardService {

	Overview getOverview();

	Summary getQuoteSummary(String substatus);

	Summary getSalesOrderSummary(String substatus);

	Summary getFulfillmentOrderSummary(String substatus);

	Summary getInvoiceSummary(String substatus);

	OrderStatusDetails getOrderStatusDetails(String status, String substatus);
}
