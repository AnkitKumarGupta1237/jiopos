package com.integra.jiopos.controller;

public class PickedOrderDetails {
	
	private String ORDER_NO;
    private String ORDER_DATE;
    private String ORDER_STATUS;
    private String ORDER_STATUS_DATE;
    private String SOURCE;

    // Constructor, Getters, and Setters
    public PickedOrderDetails(String ORDER_NO, String ORDER_DATE, String ORDER_STATUS, String ORDER_STATUS_DATE, String SOURCE) {
        this.ORDER_NO = ORDER_NO;
        this.ORDER_DATE = ORDER_DATE;
        this.ORDER_STATUS = ORDER_STATUS;
        this.ORDER_STATUS_DATE = ORDER_STATUS_DATE;
        this.SOURCE = SOURCE;
    }

    public String getORDER_NO() {
        return ORDER_NO;
    }

    public void setORDER_NO(String ORDER_NO) {
        this.ORDER_NO = ORDER_NO;
    }

    public String getORDER_DATE() {
        return ORDER_DATE;
    }

    public void setORDER_DATE(String ORDER_DATE) {
        this.ORDER_DATE = ORDER_DATE;
    }

    public String getORDER_STATUS() {
        return ORDER_STATUS;
    }

    public void setORDER_STATUS(String ORDER_STATUS) {
        this.ORDER_STATUS = ORDER_STATUS;
    }

    public String getORDER_STATUS_DATE() {
        return ORDER_STATUS_DATE;
    }

    public void setORDER_STATUS_DATE(String ORDER_STATUS_DATE) {
        this.ORDER_STATUS_DATE = ORDER_STATUS_DATE;
    }

    public String getSOURCE() {
        return SOURCE;
    }

    public void setSOURCE(String SOURCE) {
        this.SOURCE = SOURCE;
    }

}
