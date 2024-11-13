package com.integra.jiopos.controller;

public class PaymentDetails {

	private String TRANSACTION_NUMBER;
    private String PAYMENT_METHOD;
    private String AMOUNT;
    private String CARDNUMBER;
    private String APPROVALCODE;

    // Constructor, Getters, and Setters
    public PaymentDetails(String TRANSACTION_NUMBER, String PAYMENT_METHOD, String AMOUNT, String CARDNUMBER, String APPROVALCODE) {
        this.TRANSACTION_NUMBER = TRANSACTION_NUMBER;
        this.PAYMENT_METHOD = PAYMENT_METHOD;
        this.AMOUNT = AMOUNT;
        this.CARDNUMBER = CARDNUMBER;
        this.APPROVALCODE = APPROVALCODE;
    }

    public String getTRANSACTION_NUMBER() {
        return TRANSACTION_NUMBER;
    }

    public void setTRANSACTION_NUMBER(String TRANSACTION_NUMBER) {
        this.TRANSACTION_NUMBER = TRANSACTION_NUMBER;
    }

    public String getPAYMENT_METHOD() {
        return PAYMENT_METHOD;
    }

    public void setPAYMENT_METHOD(String PAYMENT_METHOD) {
        this.PAYMENT_METHOD = PAYMENT_METHOD;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getCARDNUMBER() {
        return CARDNUMBER;
    }

    public void setCARDNUMBER(String CARDNUMBER) {
        this.CARDNUMBER = CARDNUMBER;
    }

    public String getAPPROVALCODE() {
        return APPROVALCODE;
    }

    public void setAPPROVALCODE(String APPROVALCODE) {
        this.APPROVALCODE = APPROVALCODE;
    }
}
