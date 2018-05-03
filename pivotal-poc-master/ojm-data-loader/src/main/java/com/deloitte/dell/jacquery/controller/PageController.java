package com.deloitte.dell.jacquery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deloitte.dell.jacquery.service.OrderExportService;
import com.deloitte.dell.jacquery.service.OrderLineExtractService;
import com.deloitte.dell.jacquery.service.SalesOrderHoldService;

@Controller
public class PageController {

	@Autowired
	private OrderExportService orderExportService;

	@Autowired
	private OrderLineExtractService orderLineExtractService;
	
	@Autowired
	private SalesOrderHoldService salesOrderHoldService;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(){
		// hack to load up data
		orderExportService.initialize();
		orderLineExtractService.initialize();
		salesOrderHoldService.initialize();
		
		return "index";
	}
	
	@RequestMapping(path="/orderExport", method=RequestMethod.GET)
	public String goToOrderExport(){
		return "orderExport";
	}
	
	@RequestMapping(path="/orderLineExtract", method=RequestMethod.GET)
	public String goToOrderLineExtract(){
		return "orderLineExtract";
	}

}