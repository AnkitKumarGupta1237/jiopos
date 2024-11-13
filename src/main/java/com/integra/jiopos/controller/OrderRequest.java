package com.integra.jiopos.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderRequest {
	@JsonProperty(value="OrderId")
	private String OrderId;

    public OrderRequest() {}

	public OrderRequest(String orderId) {
		this.OrderId = orderId;
	}

	// Getter and Setter
	@JsonProperty(value="OrderId")
    public String getOrderId() {
        return OrderId;
    }

	@JsonProperty(value="OrderId")
    public void setOrderId(String orderId) {
        OrderId = orderId;
    }
}
