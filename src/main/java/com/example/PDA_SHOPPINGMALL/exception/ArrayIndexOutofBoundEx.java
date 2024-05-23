package com.example.PDA_SHOPPINGMALL.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayIndexOutofBoundEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("점수를 입력하세요");
            String str = scanner.next();
            if(isNumber(str)){
                if(Integer.parseInt(str)>60)
                    System.out.println("합격입니다");
                else
                    System.out.println("불합격입니다");
            }
            else if(str.equals("q"))
                break;

        }

    }

    public static boolean isNumber(String num) {
        return Pattern.matches("^[0-9]*$", num);
    }

    public static boolean isAlpha(String str) {
        return Pattern.matches("^[a-zA-Z]", str);
    }
}
