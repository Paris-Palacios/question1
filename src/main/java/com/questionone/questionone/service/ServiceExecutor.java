package com.questionone.questionone.service;

import com.questionone.questionone.entity.Order;
import com.questionone.questionone.entity.OrderDetailsDto;
import com.questionone.questionone.entity.Shipment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.*;

@Service
public class ServiceExecutor {

    public OrderDetailsDto getOrderDetails(String orderId) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //get order
        Future<List<Order>> futureOrder = executorService.submit(Order::getOrder);

        //get shipment
        Future<List<Shipment>> futureShipment = executorService.submit(Shipment::getShipment);


        List<Order> orderList =  futureOrder.get();
        List<Shipment> shipmentList = futureShipment.get();

        executorService.shutdown();

        Order elementOrder = orderList.stream()
                .filter(order -> order.getOrderId().equalsIgnoreCase(orderId) )
                .limit(1)
                .findFirst()
                .orElseThrow();

        Shipment elementShipment = shipmentList.stream()
                .filter(shipment -> shipment.getOrderId().equalsIgnoreCase(orderId) )
                .limit(1)
                .findFirst()
                .orElseThrow();

        return OrderDetailsDto.builder()
                .order(elementOrder)
                .shipment(elementShipment)
                .build();
    }
}
