package com.example.PDA_SHOPPINGMALL.exception;

public enum EnumDemo {
    Americano(0,"아메리카노"),
    LATTE(1,"라떼"),
    STRAWBERRY_ADE(2,"딸기에이드"),
    ESPRESSO(3,"에스프레소");
    String menu;
    int id;

    EnumDemo(int id, String menu){
        this.id = id;
        this.menu = menu;
    }


    public void selectMenu(){
        System.out.println(menu);
    }


}
