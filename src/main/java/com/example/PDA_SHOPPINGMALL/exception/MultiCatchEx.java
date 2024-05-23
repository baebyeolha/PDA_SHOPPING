package com.example.PDA_SHOPPINGMALL.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {6,2,3,4,5,1};
        System.out.println("몇번째 카드를 뽑으실래요?");
        int cardIdx = scanner.nextInt();
        try{
            System.out.println("뽑은 카드 번호는 :" + cardIdx);
            System.out.println("뽑은 카드 숫자는 :" + num[cardIdx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("1-6 사이의 숫자를 입력하세요");
        }catch(InputMismatchException e2){
            System.out.println("숫자만 입력하세요");
        }


    }
}

