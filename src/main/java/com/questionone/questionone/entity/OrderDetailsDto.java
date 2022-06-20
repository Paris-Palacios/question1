package com.questionone.questionone.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class OrderDetailsDto {
    private Order order;
    private Shipment shipment;
}
