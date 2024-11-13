package com.integra.jiopos.controller;

public class OrderRequest {
	private String OrderId;

    public OrderRequest() {}

	public OrderRequest(String orderId) {
		this.OrderId = orderId;
	}

	// Getter and Setter
    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }
}
