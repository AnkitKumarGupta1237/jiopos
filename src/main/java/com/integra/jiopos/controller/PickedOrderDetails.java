package com.integra.jiopos.controller;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class PickedOrderDetails {
	@JsonProperty(value="ORDER_NO")
	private String ORDER_NO;
	@JsonProperty(value="ORDER_DATE")
    private Date ORDER_DATE;
	@JsonProperty(value="ORDER_STATUS")
    private String ORDER_STATUS;
	@JsonProperty(value="ORDER_STATUS_DATE")
    private String ORDER_STATUS_DATE;
	@JsonProperty(value="SOURCE")
    private String SOURCE;

    @JsonProperty(value="ORDER_NO")
    public String getORDER_NO() {
        return ORDER_NO;
    }

    @JsonProperty(value="ORDER_NO")
    public void setORDER_NO(String ORDER_NO) {
        this.ORDER_NO = ORDER_NO;
    }

    @JsonProperty(value="ORDER_DATE")
    public Date getORDER_DATE() {
        return ORDER_DATE;
    }

    @JsonProperty(value="ORDER_DATE")
    public void setORDER_DATE(Date ORDER_DATE) {
        this.ORDER_DATE = ORDER_DATE;
    }

    @JsonProperty(value="ORDER_STATUS")
    public String getORDER_STATUS() {
        return ORDER_STATUS;
    }

    @JsonProperty(value="ORDER_STATUS")
    public void setORDER_STATUS(String ORDER_STATUS) {
        this.ORDER_STATUS = ORDER_STATUS;
    }

    @JsonProperty(value="ORDER_STATUS_DATE")
    public String getORDER_STATUS_DATE() {
        return ORDER_STATUS_DATE;
    }

    @JsonProperty(value="ORDER_STATUS_DATE")
    public void setORDER_STATUS_DATE(String ORDER_STATUS_DATE) {
        this.ORDER_STATUS_DATE = ORDER_STATUS_DATE;
    }

    @JsonProperty(value="SOURCE")
    public String getSOURCE() {
        return SOURCE;
    }

    @JsonProperty(value="SOURCE")
    public void setSOURCE(String SOURCE) {
        this.SOURCE = SOURCE;
    }

}
