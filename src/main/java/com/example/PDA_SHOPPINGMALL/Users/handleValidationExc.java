package com.example.PDA_SHOPPINGMALL.Users;

import com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.example.PDA_SHOPPINGMALL.Products.utils.ApiUtils.error;

@RestControllerAdvice
public class handleValidationExc {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler//(MethodArgumentNotValidException.class)
    //유효성 검사 => 예외처리
    public static ApiUtils.ApiResult handleValidationExceptions(MethodArgumentNotValidException errors){

        String message = errors.getFieldError().getDefaultMessage();
        return error(message, HttpStatus.BAD_REQUEST);

    }

}
