package com.example.PDA_SHOPPINGMALL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> sportStars = new ArrayList<>();

        sportStars.add("김원중");
        sportStars.add("레이예스");
        sportStars.add("윤동희");
        sportStars.add("나균안");
        sportStars.add("이주찬");

        for(int i=0; i<sportStars.size(); i++){
            System.out.println(sportStars.get(i));
        }

        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1,"사과");
        fruits.put(2, "배");
        fruits.put(3, "멜론");
        fruits.put(4, "블루베리");
        fruits.put(5,"파인애플");

        Iterator<String> sportStarIterator = sportStars.iterator();
        while(sportStarIterator.hasNext()){
            System.out.println(sportStarIterator.next());
        }

        Iterator<String> fruitIterator = fruits.values().iterator();
        while(fruitIterator.hasNext()){
            System.out.println(fruitIterator.next());
        }

        for(String sportStar : sportStars){
            System.out.println(sportStar);
        }

        for(String fruit : fruits.values()){
            System.out.println(fruit);
        }




    }
}
