package com.example.PDA_SHOPPINGMALL.exception;

public class NullPointerExceptionEx {

    public static void main(String[] args) {
        String[] strings = null;
        String str = null;

        try{
            System.out.println(str.charAt(0));
        }catch(NullPointerException e){ //jvm이 e를 넣어줌
            System.out.println("예외");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

}
