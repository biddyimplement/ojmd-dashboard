package com.deloitte.dell.jacquery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.dell.jacquery.model.SalesOrderHold;

@Repository("salesOrderHoldRepository")
public interface SalesOrderHoldRepository extends JpaRepository<SalesOrderHold, String>{

}