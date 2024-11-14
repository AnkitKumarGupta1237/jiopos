package com.integra.jiopos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	  @Autowired
      PickedOrderDetails orderDetails;
    private final PaymentDetails paymentDetails = new PaymentDetails(
            "47024718",
            "TataCliq",
            "4797",
            null,
            null
    );

    @PostMapping("/details")
    public ResponseEntity<OrderResponse> getOrderDetails(@RequestBody OrderRequest request) {
    	System.out.println(request.getOrderId());
            OrderResponse response = new OrderResponse();
            orderDetails.setORDER_NO(request.getOrderId());
            orderDetails.setORDER_DATE(new Date());
            orderDetails.setORDER_STATUS("DELIVERED");
            orderDetails.setORDER_STATUS_DATE(null);
            orderDetails.setSOURCE("TATACLIQ");
            response.setPICKED_ORDER_DETAILS(orderDetails);
            response.setPAYMENT_DETAILS(Collections.singletonList(paymentDetails));
            response.setDEVICE_DETAILS(null);  // Null for device details
            response.setErrorcode("00");
            response.setErrormsg("SUCCESS");
            return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
