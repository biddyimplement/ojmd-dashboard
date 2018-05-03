package com.deloitte.dell.jacquery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.dell.jacquery.model.OrderLineExtract;
import com.deloitte.dell.jacquery.service.OrderLineExtractService;

@RestController
public class OrderLineExtractRestController {
	
	@Autowired
	private OrderLineExtractService orderLineExtractService;
	
	@RequestMapping(path="/api/orderLineExtracts", method=RequestMethod.GET)
	public List<OrderLineExtract> getAllOrderLineExtracts(){
		System.out.println("Return all orders");
		return orderLineExtractService.getAllOrderLineExtracts();
	}
    @RequestMapping(value = "/api/orderLineExtract/{id}", method = RequestMethod.GET)
	public OrderLineExtract getOrderLineExtractById(@PathVariable("id") String id){
		return orderLineExtractService.getOrderLineExtractById(id);
	}

}