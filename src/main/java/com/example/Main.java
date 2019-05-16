package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Apple", "Apple", "Cherry", "Cherry", "Grape", "Lemon", "Peach", "Orange");
        System.out.println(StreamExample.getCountOfString(fruits)); // {Apple=3, Cherry=2, Grape=1, Peach=1, Orange=1, Lemon=1}


    }
}
