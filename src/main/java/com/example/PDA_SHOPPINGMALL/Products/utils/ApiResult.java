package com.example.PDA_SHOPPINGMALL.Products.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class ApiResult<T> {


    private boolean success;
    private T response;
    private ErrorDetails error;

    @AllArgsConstructor
    @Getter
    public class ErrorDetails{
        private HttpStatus status;
        private String message;

    }



}


