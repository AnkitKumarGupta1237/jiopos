package com.integra.jiopos.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDetails {

	@JsonProperty(value="TRANSACTION_NUMBER")
	private String TRANSACTION_NUMBER;
	@JsonProperty(value="PAYMENT_METHOD")
    private String PAYMENT_METHOD;
	@JsonProperty(value="AMOUNT")
    private String AMOUNT;
	@JsonProperty(value="CARDNUMBER")
    private String CARDNUMBER;
	@JsonProperty(value="APPROVALCODE")
    private String APPROVALCODE;
	

    // Constructor, Getters, and Setters
    public PaymentDetails(String TRANSACTION_NUMBER, String PAYMENT_METHOD, String AMOUNT, String CARDNUMBER, String APPROVALCODE) {
        this.TRANSACTION_NUMBER = TRANSACTION_NUMBER;
        this.PAYMENT_METHOD = PAYMENT_METHOD;
        this.AMOUNT = AMOUNT;
        this.CARDNUMBER = CARDNUMBER;
        this.APPROVALCODE = APPROVALCODE;
    }

    @JsonProperty(value="TRANSACTION_NUMBER")
    public String getTRANSACTION_NUMBER() {
        return TRANSACTION_NUMBER;
    }

    @JsonProperty(value="TRANSACTION_NUMBER")
    public void setTRANSACTION_NUMBER(String TRANSACTION_NUMBER) {
        this.TRANSACTION_NUMBER = TRANSACTION_NUMBER;
    }

    @JsonProperty(value="PAYMENT_METHOD")
    public String getPAYMENT_METHOD() {
        return PAYMENT_METHOD;
    }

    @JsonProperty(value="PAYMENT_METHOD")
    public void setPAYMENT_METHOD(String PAYMENT_METHOD) {
        this.PAYMENT_METHOD = PAYMENT_METHOD;
    }

    @JsonProperty(value="AMOUNT")
    public String getAMOUNT() {
        return AMOUNT;
    }

    @JsonProperty(value="AMOUNT")
    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    @JsonProperty(value="CARDNUMBER")
    public String getCARDNUMBER() {
        return CARDNUMBER;
    }

    @JsonProperty(value="CARDNUMBER")
    public void setCARDNUMBER(String CARDNUMBER) {
        this.CARDNUMBER = CARDNUMBER;
    }

    @JsonProperty(value="APPROVALCODE")
    public String getAPPROVALCODE() {
        return APPROVALCODE;
    }

    @JsonProperty(value="APPROVALCODE")
    public void setAPPROVALCODE(String APPROVALCODE) {
        this.APPROVALCODE = APPROVALCODE;
    }
}
