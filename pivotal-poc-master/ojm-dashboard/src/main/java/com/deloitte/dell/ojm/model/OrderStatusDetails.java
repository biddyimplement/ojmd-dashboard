package com.deloitte.dell.ojm.model;

import java.util.List;

public class OrderStatusDetails {

    private final List<OrderStatus> data;

    public OrderStatusDetails(List<OrderStatus> orders) {
        this.data = orders;
    }

    public List<OrderStatus> getData() {
        return data;
    }
}
