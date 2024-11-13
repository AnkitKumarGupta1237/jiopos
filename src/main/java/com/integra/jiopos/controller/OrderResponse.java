package com.integra.jiopos.controller;

	import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

	public class OrderResponse {

		@JsonProperty(value="PICKED_ORDER_DETAILS")
	    private PickedOrderDetails PICKED_ORDER_DETAILS;
		@JsonProperty(value="PAYMENT_DETAILS")
	    private List<PaymentDetails> PAYMENT_DETAILS;
		@JsonProperty(value="DEVICE_DETAILS")
	    private Object DEVICE_DETAILS; 
		@JsonProperty(value="Errorcode")
	    private String Errorcode;
		@JsonProperty(value="Errormsg")
	    private String Errormsg;

	    // Getters and Setters
		@JsonProperty(value="PICKED_ORDER_DETAILS")
	    public PickedOrderDetails getPICKED_ORDER_DETAILS() {
	        return PICKED_ORDER_DETAILS;
	    }

		@JsonProperty(value="PICKED_ORDER_DETAILS")
	    public void setPICKED_ORDER_DETAILS(PickedOrderDetails PICKED_ORDER_DETAILS) {
	        this.PICKED_ORDER_DETAILS = PICKED_ORDER_DETAILS;
	    }
		@JsonProperty(value="PAYMENT_DETAILS")
	    public List<PaymentDetails> getPAYMENT_DETAILS() {
	        return PAYMENT_DETAILS;
	    }
		@JsonProperty(value="PAYMENT_DETAILS")
	    public void setPAYMENT_DETAILS(List<PaymentDetails> PAYMENT_DETAILS) {
	        this.PAYMENT_DETAILS = PAYMENT_DETAILS;
	    }
		@JsonProperty(value="DEVICE_DETAILS")
	    public Object getDEVICE_DETAILS() {
	        return DEVICE_DETAILS;
	    }
		@JsonProperty(value="DEVICE_DETAILS")
	    public void setDEVICE_DETAILS(Object DEVICE_DETAILS) {
	        this.DEVICE_DETAILS = DEVICE_DETAILS;
	    }

		@JsonProperty(value="Errorcode")
	    public String getErrorcode() {
	        return Errorcode;
	    }

		@JsonProperty(value="Errorcode")
	    public void setErrorcode(String errorcode) {
	        Errorcode = errorcode;
	    }

		@JsonProperty(value="Errormsg")
	    public String getErrormsg() {
	        return Errormsg;
	    }

		@JsonProperty(value="Errormsg")
	    public void setErrormsg(String errormsg) {
	        Errormsg = errormsg;
	    }
	}