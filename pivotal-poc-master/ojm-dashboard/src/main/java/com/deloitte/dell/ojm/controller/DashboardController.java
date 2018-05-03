package com.deloitte.dell.ojm.controller;

import com.deloitte.dell.ojm.model.*;
import com.deloitte.dell.ojm.utilities.DashboardConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.deloitte.dell.ojm.service.DashboardService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class DashboardController {
	private static final Logger logger = LoggerFactory
			.getLogger(DashboardController.class);

	@Autowired
	DashboardService dashboardService;
	
	@RequestMapping(value = "/overview", method = RequestMethod.GET)
	public Overview get() {
		logger.info("Getting overview");
		return dashboardService.getOverview();
	}

	/**
	 * Quote: Draft | Validated
	 * Sales Order: Draft | Submitted | On Hold | Dropped to Fulfillment
	 * Fulfillment Order: Pending Production | In Process | Ready to Ship | Manifest (ESD) | Customer Receipt
	 * Invoice: Invoice Not Created
	 */
	@RequestMapping(value = "/summary/{status}/{substatus}", method = RequestMethod.GET)
	public Summary getSummary(@PathVariable String status,@PathVariable String substatus) {
		logger.info("Getting summary of " + status + " in " + substatus);

		switch (status){

			case DashboardConstants.QUOTE:
				return dashboardService.getQuoteSummary(substatus);
			case DashboardConstants.SALES_ORDER:
				return dashboardService.getSalesOrderSummary(substatus);
			case DashboardConstants.FULLFILMENT_ORDER:
				return dashboardService.getFulfillmentOrderSummary(substatus);
			case DashboardConstants.INVOICE:
				return dashboardService.getInvoiceSummary(substatus);
			default:
				throw new IllegalArgumentException("Invalid Status");
		}
	}

	@RequestMapping(value = "/details/{status}/{substatus}", method = RequestMethod.GET)
	public OrderStatusDetails getDetails(@PathVariable String status, @PathVariable String substatus) {
		return dashboardService.getOrderStatusDetails(status,substatus);
	}
}