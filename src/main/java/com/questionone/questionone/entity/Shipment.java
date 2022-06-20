package com.questionone.questionone.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

@Data
@Slf4j
@Builder
@AllArgsConstructor
public class Shipment {
    private String orderId;
    private String shipmentId;
    private String productId;
    private Date shipmentDate;
    private Double qty;

    public static List<Shipment> getShipment(){

        Shipment shipment =Shipment.builder()
                .orderId("Order1")
                .shipmentId("Ship1")
                .productId("Prod1")
                .shipmentDate(new Date(2021-02-19))
                .qty(2.0)
                .build();
        List<Shipment> shipmentList = List.of(shipment);

       log.info("Getting shipment list");

       return shipmentList;
    }
}
