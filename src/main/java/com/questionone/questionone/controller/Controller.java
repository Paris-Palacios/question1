package com.questionone.questionone.controller;

import com.questionone.questionone.entity.OrderDetailsDto;
import com.questionone.questionone.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("/getOrderDetails")
    public OrderDetailsDto getOrderDetails(@RequestParam(name = "orderId") String orderId){
        return orderDetailsService.getOrderDetails(orderId);
    }
}
