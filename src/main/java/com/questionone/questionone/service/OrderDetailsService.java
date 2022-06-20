package com.questionone.questionone.service;

import com.questionone.questionone.entity.OrderDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class OrderDetailsService {

    @Autowired
    private ServiceExecutor serviceExecutor;
    public OrderDetailsDto getOrderDetails(String orderId){

        try {
            return serviceExecutor.getOrderDetails(orderId);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
