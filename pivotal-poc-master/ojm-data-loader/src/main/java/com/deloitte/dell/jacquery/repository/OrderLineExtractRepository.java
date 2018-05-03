package com.deloitte.dell.jacquery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.dell.jacquery.model.OrderLineExtract;

@Repository("orderLineExtractRepository")
public interface OrderLineExtractRepository extends JpaRepository<OrderLineExtract, String>{

}