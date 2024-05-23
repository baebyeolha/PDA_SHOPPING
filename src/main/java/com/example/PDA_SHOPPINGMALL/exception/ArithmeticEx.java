package com.example.PDA_SHOPPINGMALL.exception;

import java.util.Scanner;

public class ArithmeticEx {

    public static void main(String[] args) {

        int[] baseball = {6,3,0};
        int time = 10;
        int s=0; int b=0; int o=0;
        Scanner scanner = new Scanner(System.in);

        while(time>0){
            s=0; b=0; o=0;
            System.out.println("3개의 숫자를 맞혀보세요");
            String str = scanner.next();

            if (str.charAt(0) == str.charAt(1) || str.charAt(0) == str.charAt(2) || str.charAt(1) == str.charAt(2)) {
                System.out.println("중복된 숫자를 입력하셨습니다.");
                System.out.println("남은기회: " + time);
                continue;
            }


            for(int i=0; i<str.length(); i++){
                int k=0; int j=0;
                if(i==0){
                    k=1; j=2;
                } else if (i == 1) {
                    k=0; j=2;
                }else{
                    k=0; j=1;
                }

                try{
                    if(Integer.parseInt(String.valueOf(str.charAt(i))) == baseball[i]){
                        s ++;
                    }
                    else if(Integer.parseInt(String.valueOf(str.charAt(i))) == baseball[k] ||Integer.parseInt(String.valueOf(str.charAt(i))) == baseball[j]){
                        b++;
                    }
                    else{
                        o++;
                    }
                }catch (NumberFormatException e){
                    System.out.println("숫자를 입력하세요!");//문자열 입력시 오류
                }  catch (ArrayIndexOutOfBoundsException e2){
                    System.out.println("숫자 3개만 입력하세요");
                }
            }

            if(s==3){
                System.out.println("you win!");
                break;
            }

            System.out.println(s+"s"+b+"b"+o+"o");
            time --;
            System.out.println("남은기회: " + time);
        }




    }



}
