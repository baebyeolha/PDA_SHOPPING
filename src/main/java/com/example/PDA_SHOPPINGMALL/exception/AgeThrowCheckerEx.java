package com.example.PDA_SHOPPINGMALL.exception;

import java.util.Scanner;

public class AgeThrowCheckerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요. 범위는 0 ~ 100");

        while(true){
            try {
                int age = scanner.nextInt();

                if (age > -1 && age < 101) {
                    System.out.println("당신의 나이는" + age + "살이시네요. 반갑습니다");
                } else if (age == -1) {
                    break;
                } else if (age < 0 || age > 100) {
                    throw new Exception("0~100 사이로 입력해주세요");
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }




    }
}
