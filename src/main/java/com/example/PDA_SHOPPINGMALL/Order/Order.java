package com.example.PDA_SHOPPINGMALL.Order;

import com.example.PDA_SHOPPINGMALL.Products.Product;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Order {

    int id;
    Product product;
    int count;


    public Order(Product product, int count){
        this.product = product;
        this.count = count;
    }

}
