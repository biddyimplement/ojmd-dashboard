package com.deloitte.dell.jacquery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.dell.jacquery.model.OrderExport;
import com.deloitte.dell.jacquery.service.OrderExportService;

@RestController
public class OrderExportRestController {
	
	@Autowired
	private OrderExportService orderExportService;
	
	@RequestMapping(path="/api/orderExports", method=RequestMethod.GET)
	public List<OrderExport> getAllOrderExports(){
		System.out.println("Return all orders");
		return orderExportService.getAllOrderExports();
	}
    @RequestMapping(value = "/api/orderExport/{id}", method = RequestMethod.GET)
	public OrderExport getOrderExportById(@PathVariable("id") String id){
		return orderExportService.getOrderExportById(id);
	}

}