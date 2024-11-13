package com.integra.jiopos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	private final PickedOrderDetails orderDetails = new PickedOrderDetails(
            "124050010268986",
            "22-10-2024 21:45:03",
            "COMPLETE",
            null,
            "TATACLIQ"
    );

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
//        if ("124050010268986".equals(request.getOrderId())) {
            OrderResponse response = new OrderResponse();
            response.setPICKED_ORDER_DETAILS(orderDetails);
            response.setPAYMENT_DETAILS(Collections.singletonList(paymentDetails));
            response.setDEVICE_DETAILS(null);  // Null for device details
            response.setErrorcode("00");
            response.setErrormsg("SUCCESS");

            return new ResponseEntity<>(response, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
    }
}
