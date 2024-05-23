package com.example.PDA_SHOPPINGMALL.Generic;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        //3종류의 차가 순서대로 bbang()
        Texi texi = new Texi();
        Bus bus = new Bus();
        Bike bike = new Bike();
        cars[0] = texi;
        cars[1] = bus;
        cars[2] = bike;

        for(int i=0; i<3; i++){
            cars[i].bbang();
        }

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(texi);
        carArrayList.add(bus);
        carArrayList.add(bike);

        for(int i=0; i<carArrayList.size(); i++){
            carArrayList.get(i).bbang();
        }

        CarList<Car> carList = new CarList<>();
        carList.add(texi);
        carList.add(bus);
        carList.add(bike);

        for(int i=0; i<carList.size(); i++){
            carList.get(i).bbang();
        }



    }

}

class Car{
    void bbang(){
        System.out.println("경적소리");
    }
}

class Texi extends Car{
    void bbang(){
        System.out.println("빵");
    }

}
class Bus extends Car{
    void bbang(){
        System.out.println("빵빵");
    }

}
class Bike extends Car{
    void bbang(){
        System.out.println("띠링띠링");
    }

}

class CarList<T> {

    ArrayList<T> arrayList = new ArrayList<T>();

    void add(T data){
       arrayList.add(data);
    }

    int size(){
        return arrayList.size();
    }

    T get(int i){
        return arrayList.get(i);
    }



}


