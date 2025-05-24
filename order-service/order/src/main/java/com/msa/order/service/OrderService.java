package com.msa.order.service;

import com.msa.order.api.request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {


    @Transactional(rollbackFor = Exception.class)
    public String order(OrderRequest orderRequest) {

        return "Order created successfully!";
    }
}
