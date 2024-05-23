package com.example.PDA_SHOPPINGMALL.Order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
@Slf4j
public class OrderRepository {

    private int id = 0;


    Map<Integer, Order> orderTable = new HashMap<>();
    public void orderProduct(Order order) {

        log.info("productName={}", order.getProduct().getName());
        log.info("count={}", order.getCount());

        order.setId(id ++);
        orderTable.put(order.getId(), order);

    }
}
