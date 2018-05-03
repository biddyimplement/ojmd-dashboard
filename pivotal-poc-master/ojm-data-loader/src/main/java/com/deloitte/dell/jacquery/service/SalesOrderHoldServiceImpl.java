package com.deloitte.dell.jacquery.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dell.jacquery.model.SalesOrderHold;
import com.deloitte.dell.jacquery.repository.SalesOrderHoldRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Service("salesOrderHoldService")
public class SalesOrderHoldServiceImpl implements SalesOrderHoldService {

	@Autowired
	private SalesOrderHoldRepository salesOrderHoldRepository;

	@Override
	public List<SalesOrderHold> getAllSalesOrderHolds() {
		return salesOrderHoldRepository.findAll();
	}

	@Override
	public SalesOrderHold getSalesOrderHoldById(String salesOrderNum) {
		return salesOrderHoldRepository.findOne(salesOrderNum);
	}

	@Override
	public void initialize() {
		try {
			CsvToBean<SalesOrderHold> csvToBean = new CsvToBeanBuilder<SalesOrderHold>(
					new FileReader("C:/Users/abadami/Documents/Dell/dashboard/code/pivotal-poc/ojm-data-loader/data/Holds_Export_Data.csv"))
				       .withSeparator(',').withQuoteChar('\"').withType(SalesOrderHold.class).build();
			
			List<SalesOrderHold> salesOrderHolds = csvToBean.parse();
			
			for(SalesOrderHold o : salesOrderHolds) {
				salesOrderHoldRepository.save(o);
			}
			
		} catch (IllegalStateException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}