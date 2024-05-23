package com.example.PDA_SHOPPINGMALL.Products;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class ProductDTO {

    private int id;

    @NotNull(message = "카테고리 아이디가 입력되지 않았습니다")
    private int categoryId;

    @NotBlank(message = "상품 이름이 입력되지 않았습니다")
    @Pattern(regexp = "^[a-zA-Z가-힣]*$", message = "상품 이름은 문자만 가능합니다")
    private String name;

    @NotNull(message = "상품 가격이 입력되지 않았습니다")
    @Min(value = 0, message = "상품 가격은 0 이상이어야 합니다")
    private int price;

    @NotBlank(message = "상품 정보가 입력되지 않았습니다")
    private String description;

    public Product convertToEntity() {
        return new Product(id, categoryId, name, price, description);
    }
}

