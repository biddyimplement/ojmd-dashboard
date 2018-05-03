/**
 * 
 */
package com.deloitte.dell.ojm.service;

import java.util.*;

import com.deloitte.dell.ojm.controller.DashboardController;
import com.deloitte.dell.ojm.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author abadami
 *
 */
@Service
public class DashboardServiceImpl implements DashboardService {

	private static final Logger logger = LoggerFactory
			.getLogger(DashboardServiceImpl.class);

	@Override
	public Overview getOverview() {
		logger.info("Getting overview");
		Overview overview = new Overview();
		overview.setDescription("Overview of the Orders Pipeline");
		overview.setTitle("Overview");
		overview.setInProgressCount(77);
		overview.setAlertsCount(37);
		overview.setPastDueCount(21);

		List<DataPoint> dataPoints = new ArrayList<>();
		DataPoint quotesSummary = new DataPoint();
		quotesSummary.setCount(30);
		quotesSummary.setCountInProgress(18);
		quotesSummary.setCountAlerts(7);
		quotesSummary.setCountPastDue(5);
		quotesSummary.setTitle("Quotes");
		quotesSummary.setDescription("Quotes");
		dataPoints.add(quotesSummary);

		DataPoint ordersSummary = new DataPoint();
		ordersSummary.setCount(40);
		ordersSummary.setCountInProgress(20);
		ordersSummary.setCountAlerts(9);
		ordersSummary.setCountPastDue(6);
		ordersSummary.setTitle("Orders");
		ordersSummary.setDescription("Orders");
		dataPoints.add(ordersSummary);

		DataPoint fulfillmentsSummary = new DataPoint();
		fulfillmentsSummary.setCount(50);
		fulfillmentsSummary.setCountInProgress(23);
		fulfillmentsSummary.setCountAlerts(15);
		fulfillmentsSummary.setCountPastDue(7);
		fulfillmentsSummary.setTitle("Fulfillments");
		fulfillmentsSummary.setDescription("Fulfillments");
		dataPoints.add(fulfillmentsSummary);

		DataPoint invoicesSummary = new DataPoint();
		invoicesSummary.setCount(25);
		invoicesSummary.setCountInProgress(16);
		invoicesSummary.setCountAlerts(6);
		invoicesSummary.setCountPastDue(3);
		invoicesSummary.setTitle("Invoices");
		invoicesSummary.setDescription("Invoices");
		dataPoints.add(invoicesSummary);

		overview.setData(dataPoints);
		return overview;
	}

	@Override
	public Summary getQuoteSummary(String substatus) {
		Summary summary = new Summary();
		logger.info("Getting summary of quote data");
		summary.setTitle("Orders in 'Quote' State");
		summary.setDescription("Summary of the orders in 'Quote' state");
		summary.setInProgressCount(18);
		summary.setAlertsCount(7);
		summary.setPastDueCount(5);

		// total 30
		List<DataPoint> dataPoints = new ArrayList<>();

		DataPoint draft = new DataPoint();
		draft.setCount(10);
		draft.setCountAlerts(3);
		draft.setCountInProgress(7);
		draft.setCountPastDue(0);
		draft.setTitle("Draft");
		draft.setDescription("Draft");
		dataPoints.add(draft);

		DataPoint validated = new DataPoint();
		validated.setCount(20);
		validated.setCountAlerts(4);
		validated.setCountInProgress(11);
		validated.setCountPastDue(5);
		validated.setTitle("Validated");
		validated.setDescription("Validated");
		dataPoints.add(validated);

		summary.setData(dataPoints);

		return summary;
	}

	@Override
	public Summary getSalesOrderSummary(String substatus) {
		Summary summary = new Summary();
		logger.info("Getting summary of quote data");
		summary.setTitle("Orders in 'Sales Order' State");
		summary.setDescription("Summary of the orders in 'Sales Order' state");
		summary.setInProgressCount(20);
		summary.setAlertsCount(9);
		summary.setPastDueCount(6);

		List<DataPoint> dataPoints = new ArrayList<>();

		DataPoint one = new DataPoint();
		one.setCount(15);
		one.setCountAlerts(3);
		one.setCountInProgress(8);
		one.setCountPastDue(4);
		one.setTitle("Draft");
		one.setDescription("Draft");
		dataPoints.add(one);

		DataPoint two = new DataPoint();
		two.setCount(10);
		two.setCountAlerts(3);
		two.setCountInProgress(6);
		two.setCountPastDue(1);
		two.setTitle("Submitted");
		two.setDescription("Submitted");
		dataPoints.add(two);

		DataPoint three = new DataPoint();
		three.setCount(5);
		three.setCountAlerts(2);
		three.setCountInProgress(2);
		three.setCountPastDue(1);
		three.setTitle("On Hold");
		three.setDescription("On Hold");
		dataPoints.add(three);

		DataPoint four = new DataPoint();
		four.setCount(5);
		four.setCountAlerts(1);
		four.setCountInProgress(4);
		four.setCountPastDue(0);
		four.setTitle("Dropped to Fulfillment");
		four.setDescription("Dropped to Fulfillment");
		dataPoints.add(four);

		summary.setData(dataPoints);

		return summary;
	}

	@Override
	public Summary getFulfillmentOrderSummary(String substatus) {
		Summary summary = new Summary();
		logger.info("Getting summary of fulfillment order data");
		summary.setTitle("Orders in 'Fulfillment Order' State");
		summary.setDescription("Summary of the orders in 'Fulfillment Order' state");
		summary.setInProgressCount(25);
		summary.setAlertsCount(15);
		summary.setPastDueCount(7);

		List<DataPoint> dataPoints = new ArrayList<>();

		DataPoint one = new DataPoint();
		one.setCount(15);
		one.setCountAlerts(4);
		one.setCountInProgress(7);
		one.setCountPastDue(4);
		one.setTitle("Pending Production");
		one.setDescription("Pending Production");
		dataPoints.add(one);

		DataPoint two = new DataPoint();
		two.setCount(10);
		two.setCountAlerts(3);
		two.setCountInProgress(6);
		two.setCountPastDue(1);
		two.setTitle("In Production");
		two.setDescription("In Production");
		dataPoints.add(two);

		DataPoint three = new DataPoint();
		three.setCount(5);
		three.setCountAlerts(3);
		three.setCountInProgress(2);
		three.setCountPastDue(0);
		three.setTitle("Ready to Ship");
		three.setDescription("Ready to Ship");
		dataPoints.add(three);

		DataPoint four = new DataPoint();
		four.setCount(5);
		four.setCountAlerts(2);
		four.setCountInProgress(2);
		four.setCountPastDue(1);
		four.setTitle("Manifest (ESD)");
		four.setDescription("Manifest (ESD)");
		dataPoints.add(four);

		DataPoint five = new DataPoint();
		five.setCount(5);
		five.setCountAlerts(3);
		five.setCountInProgress(6);
		five.setCountPastDue(1);
		five.setTitle("Customer Receipt");
		five.setDescription("Customer Receipt");
		dataPoints.add(five);

		summary.setData(dataPoints);

		return summary;
	}

	@Override
	public Summary getInvoiceSummary(String substatus) {
		Summary summary = new Summary();
		logger.info("Getting summary of quote data");
		summary.setTitle("Orders in 'Invoice' State");
		summary.setDescription("Summary of the orders in 'Invoice' state");
		summary.setInProgressCount(16);
		summary.setAlertsCount(6);
		summary.setPastDueCount(3);

		List<DataPoint> dataPoints = new ArrayList<>();

		DataPoint inProgress = new DataPoint();
		inProgress.setCount(25);
		inProgress.setCountAlerts(6);
		inProgress.setCountInProgress(16);
		inProgress.setCountPastDue(3);
		inProgress.setTitle("Invoice Not Created");
		inProgress.setDescription("Invoice Not Created");
		dataPoints.add(inProgress);

		summary.setData(dataPoints);

		return summary;
	}

	@Override
	public OrderStatusDetails getOrderStatusDetails(String status, String substatus) {
		List<OrderStatus> orders = new ArrayList<>();

		OrderStatus one = new OrderStatus();
		one.setOrderTitle("83758202: Latitude x 40");
		one.setDueDate(new Date());
		one.setReviewLink("https://www.google.com");
		one.setStatus("Sales Order");
		one.setSubStatus("Submitted");
		Map<String,String> oneDetails = new HashMap<>();
		oneDetails.put("Detail Title 1", "Detail Value");
		oneDetails.put("Detail Title 2", "Detail Value");
		oneDetails.put("Detail Title 3", "Detail Value");
		one.setOrderDetails(oneDetails);
		List<DataPoint> oneDetailsList = new ArrayList<>();
		oneDetailsList.add(new DataPoint("Detail Title 1", 1, "Detail Value"));
		oneDetailsList.add(new DataPoint("Detail Title 2", 2, "Detail Value"));
		oneDetailsList.add(new DataPoint("Detail Title 3", 3, "Detail Value"));
		one.setOrderDetailList(oneDetailsList);
		orders.add(one);

		OrderStatus two = new OrderStatus();
		two.setOrderTitle("85985104: XPS x 70");
		two.setDueDate(new Date());
		two.setReviewLink("https://www.times.com");
		two.setStatus("Invoice");
		two.setSubStatus("Invoice Not Created");
		Map<String,String> twoDetails = new HashMap<>();
		twoDetails.put("Detail Title 1", "Detail Value");
		twoDetails.put("Detail Title 2", "Detail Value");
		twoDetails.put("Detail Title 3", "Detail Value");
		two.setOrderDetails(twoDetails);
		List<DataPoint> twoDetailsList = new ArrayList<>();
		twoDetailsList.add(new DataPoint("Detail Title 1", 1, "Detail Value"));
		twoDetailsList.add(new DataPoint("Detail Title 2", 2, "Detail Value"));
		twoDetailsList.add(new DataPoint("Detail Title 3", 3, "Detail Value"));
		two.setOrderDetailList(twoDetailsList);
		orders.add(two);


		OrderStatus three = new OrderStatus();
		three.setOrderTitle("39485703: Inspiron x 82");
		three.setDueDate(new Date());
		three.setReviewLink("https://www.cnn.com");
		three.setStatus("Fulfillment Order");
		three.setSubStatus("Ready to Ship");
		Map<String,String> threeDetails = new HashMap<>();
		threeDetails.put("Detail Title 1", "Detail Value");
		threeDetails.put("Detail Title 2", "Detail Value");
		threeDetails.put("Detail Title 3", "Detail Value");
		three.setOrderDetails(threeDetails);
		List<DataPoint> threeDetailsList = new ArrayList<>();
		threeDetailsList.add(new DataPoint("Detail Title 1", 1, "Detail Value"));
		threeDetailsList.add(new DataPoint("Detail Title 2", 2, "Detail Value"));
		threeDetailsList.add(new DataPoint("Detail Title 3", 3, "Detail Value"));
		three.setOrderDetailList(threeDetailsList);
		orders.add(three);

		return new OrderStatusDetails(orders);
	}
}
