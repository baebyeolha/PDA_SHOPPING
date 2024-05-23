package com.example.PDA_SHOPPINGMALL.Order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    OrderRepository orderRepository;
    //ProductRepository productRepository;
    public void saveProduct(Order requestOrder) {

        //Product product= productRepository.findProduct(orderDTO.productId);
        //Order order = new Order(product, orderDTO.getCount());
        orderRepository.orderProduct(requestOrder);
    }
}
