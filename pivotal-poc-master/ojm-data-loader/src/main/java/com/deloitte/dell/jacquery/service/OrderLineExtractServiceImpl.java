package com.deloitte.dell.jacquery.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dell.jacquery.model.OrderLineExtract;
import com.deloitte.dell.jacquery.repository.OrderLineExtractRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Service("orderLineExtractService")
public class OrderLineExtractServiceImpl implements OrderLineExtractService {

	@Autowired
	private OrderLineExtractRepository orderLineExtractRepository;

	@Override
	public List<OrderLineExtract> getAllOrderLineExtracts() {
		return orderLineExtractRepository.findAll();
	}

	@Override
	public OrderLineExtract getOrderLineExtractById(String salesOrderNum) {
		return orderLineExtractRepository.findOne(salesOrderNum);
	}

	@Override
	public void initialize() {
		try {
			CsvToBean<OrderLineExtract> csvToBean = new CsvToBeanBuilder<OrderLineExtract>(
					new FileReader("C:/Users/abadami/Documents/Dell/dashboard/code/pivotal-poc/ojm-data-loader/data/Order_Line_Extract_Data.csv"))
				       .withSeparator(',').withQuoteChar('\'').withType(OrderLineExtract.class).build();
			
			List<OrderLineExtract> orderExports = csvToBean.parse();
			
			for(OrderLineExtract o : orderExports) {
				orderLineExtractRepository.save(o);
			}
			
		} catch (IllegalStateException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}