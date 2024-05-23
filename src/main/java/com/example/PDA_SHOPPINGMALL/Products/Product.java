package com.example.PDA_SHOPPINGMALL.Products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @NonNull
    int categoryId;
    @NonNull
    String name;
    @NonNull
    int price;
    @NonNull
    String description;

    public Integer getId(){return id;}
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public int getCategoryId(){return categoryId;}


}
