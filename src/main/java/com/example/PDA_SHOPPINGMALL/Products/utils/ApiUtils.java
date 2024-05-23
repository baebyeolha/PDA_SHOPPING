package com.example.PDA_SHOPPINGMALL.Products.utils;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@Setter
public class ApiUtils<T> {

    public static <T> ApiResult<T> success(T data){
        return new ApiResult<>(true, data,null);
    }

    public static <M> ApiResult<M> error(M message, HttpStatus httpStatus){
        return new ApiResult(false, null, new ErrorDetails(httpStatus, message));
    }



    @AllArgsConstructor
    @Getter
    static public class ApiResult<T> {


        private boolean success;
        private T response;
        private ErrorDetails error;


    }

    @AllArgsConstructor
    @Getter
    static public class ErrorDetails<M> {
        private HttpStatus status;
        private M message;

    }
}
