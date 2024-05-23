package com.example.PDA_SHOPPINGMALL.Order;

import com.example.PDA_SHOPPINGMALL.Products.Product;
import com.example.PDA_SHOPPINGMALL.Products.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class OrderController {

    OrderService orderService;
    ProductService productService;

    @PostMapping("/orders")
    public void orderProduct(@RequestBody OrderDTO orderDTO){

        Product orderedProduct = productService.findProduct(orderDTO.getProductId());
        //DTO -> Entity
        Order requestorder = new Order(orderedProduct,orderDTO.getCount());
        orderService.saveProduct(requestorder);

    }

}
