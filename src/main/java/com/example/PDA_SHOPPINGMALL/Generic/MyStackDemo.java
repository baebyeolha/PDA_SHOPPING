package com.example.PDA_SHOPPINGMALL.Generic;

import java.util.ArrayList;

public class MyStackDemo {

    public static void main(String[] args) {
        MyStack<String> stackStr = new MyStack();

        System.out.println(stackStr.isEmpty());
        stackStr.push("a");
        stackStr.push("b");
        stackStr.push("c");

        System.out.println(stackStr.isEmpty());

        System.out.println(stackStr.pop());
        System.out.println(stackStr.peek());
    }
}

class MyStack<T>{

    ArrayList<String> stack = new ArrayList<>();
    void push(String s){
        stack.add(s);
    }

    boolean isEmpty(){
        return stack.isEmpty();
    }

    String pop(){
        return stack.remove(stack.size()-1);
    }

    String peek(){
        return stack.get(stack.size()-1);
    }

    void print(){
        for(int i=stack.size(); i<=0; i--){
            System.out.println(stack.get(i));
        }

    }










}

