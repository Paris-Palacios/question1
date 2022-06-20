package com.questionone.questionone.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

@Data
@Slf4j
@AllArgsConstructor
@Builder
public class Order {
    private String orderId;
    private String productId;
    private Double qty;

    public static List<Order> getOrder(){

        Order order = Order.builder()
                .orderId("Order1")
                .productId("Prod1")
                .qty(2.0)
                .build();

        List<Order> orderList = List.of(order);

        log.info("Getting orders lists");
        return orderList;
    }
}
