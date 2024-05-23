package com.example.PDA_SHOPPINGMALL.exception;

public class Ex extends Exception {

    private  String message;

    public Ex(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public static void main(String[] args) {

    }

}
