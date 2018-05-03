package com.deloitte.dell.jacquery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.dell.jacquery.model.OrderExport;

@Repository("orderExportRepository")
public interface OrderExportRepository extends JpaRepository<OrderExport, String>{

}