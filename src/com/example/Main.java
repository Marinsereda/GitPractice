package com.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static String getNumbers () {
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap <Integer , Integer> count = new HashMap<>();
        for (int i=0; i<100; i++){
           int each = (int)(Math.random()*10);
           numbers.add(each); }
        for (int n : numbers){
            Integer i = count.get(n);
            count.put(n,  i==null ? 1 : i +1); }
        return count.toString();
    }

    public static void main(String[] args){
        System.out.println(getNumbers());
    }

}
