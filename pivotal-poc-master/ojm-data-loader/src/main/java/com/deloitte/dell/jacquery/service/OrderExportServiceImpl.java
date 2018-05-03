package com.deloitte.dell.jacquery.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dell.jacquery.model.OrderExport;
import com.deloitte.dell.jacquery.repository.OrderExportRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Service("orderExportService")
public class OrderExportServiceImpl implements OrderExportService {

	@Autowired
	private OrderExportRepository orderExportRepository;

	@Override
	public List<OrderExport> getAllOrderExports() {
		return orderExportRepository.findAll();
	}

	@Override
	public OrderExport getOrderExportById(String salesOrderNum) {
		return orderExportRepository.findOne(salesOrderNum);
	}

	@Override
	public void initialize() {
		try {
			CsvToBean<OrderExport> csvToBean = new CsvToBeanBuilder<OrderExport>(
					new FileReader("C:/Users/abadami/Documents/Dell/dashboard/code/pivotal-poc/ojm-data-loader/data/Order_Export_Data.csv"))
				       .withSeparator(',').withQuoteChar('\'').withType(OrderExport.class).build();
			
			List<OrderExport> orderExports = csvToBean.parse();
			
			for(OrderExport o : orderExports) {
				orderExportRepository.save(o);
			}
			
		} catch (IllegalStateException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}