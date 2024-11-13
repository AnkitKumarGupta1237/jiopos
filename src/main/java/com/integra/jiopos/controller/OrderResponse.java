package com.integra.jiopos.controller;

	import java.util.List;

	public class OrderResponse {

	    private PickedOrderDetails PICKED_ORDER_DETAILS;
	    private List<PaymentDetails> PAYMENT_DETAILS;
	    private Object DEVICE_DETAILS; // Can be null or a complex object
	    private String Errorcode;
	    private String Errormsg;

	    // Getters and Setters
	    public PickedOrderDetails getPICKED_ORDER_DETAILS() {
	        return PICKED_ORDER_DETAILS;
	    }

	    public void setPICKED_ORDER_DETAILS(PickedOrderDetails PICKED_ORDER_DETAILS) {
	        this.PICKED_ORDER_DETAILS = PICKED_ORDER_DETAILS;
	    }

	    public List<PaymentDetails> getPAYMENT_DETAILS() {
	        return PAYMENT_DETAILS;
	    }

	    public void setPAYMENT_DETAILS(List<PaymentDetails> PAYMENT_DETAILS) {
	        this.PAYMENT_DETAILS = PAYMENT_DETAILS;
	    }

	    public Object getDEVICE_DETAILS() {
	        return DEVICE_DETAILS;
	    }

	    public void setDEVICE_DETAILS(Object DEVICE_DETAILS) {
	        this.DEVICE_DETAILS = DEVICE_DETAILS;
	    }

	    public String getErrorcode() {
	        return Errorcode;
	    }

	    public void setErrorcode(String errorcode) {
	        Errorcode = errorcode;
	    }

	    public String getErrormsg() {
	        return Errormsg;
	    }

	    public void setErrormsg(String errormsg) {
	        Errormsg = errormsg;
	    }
	}