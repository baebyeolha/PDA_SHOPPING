package com.example.PDA_SHOPPINGMALL.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MbtiThrowsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("===== MBTI 검사를 시작합니다 =====");
            checkEorI(scanner);
            System.out.println("");

            System.out.println("===== MBTI 검사가 종료되었습니다 =====");


        }catch (InputMismatchException e){
            System.out.println("키보드 입력이 잘못되었습니다");
        }finally {
            if(scanner != null)
                scanner.close();
        }


    }

    static void checkEorI(Scanner scanner){
        System.out.println("1. 나는 밖에서 에너지를 얻는다");
        System.out.println("2. 나는 이불 속에서 에너지를 얻는다");
        System.out.println("당신의 선택은?");
        int choice = scanner. nextInt();
        try{
            if(choice==1){
                System.out.println("E");
            }
            if(choice ==2){
                System.out.println("I");
            }
        }catch (Exception e){
            System.out.println("1 또는 2 중 선택하셔야 합니다");
        }


    }


}
