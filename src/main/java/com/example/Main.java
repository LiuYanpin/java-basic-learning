package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Apple", "Apple", "Cherry", "Cherry", "Grape", "Lemon", "Peach", "Orange");
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("Apple", 1, 1),
                new Fruit("Apple", 2, 1),
                new Fruit("Apple", 3, 1),
                new Fruit("Cherry", 4, 2),
                new Fruit("Cherry", 5, 2),
                new Fruit("Grape", 1, 3),
                new Fruit("Lemon", 2, 4),
                new Fruit("Peach", 3, 5),
                new Fruit("Orange", 4, 6)
        );

        System.out.println(StreamGroupingByExample.getCountOfString(fruits));
        // {Apple=3, Cherry=2, Grape=1, Peach=1, Orange=1, Lemon=1}

        System.out.println(StreamGroupingByExample.getCount(fruitList));
        // {Apple=3, Cherry=2, Grape=1, Peach=1, Orange=1, Lemon=1}

        System.out.println(StreamGroupingByExample.getSumOfQuantity(fruitList));
        // {Apple=6, Cherry=9, Grape=1, Peach=3, Orange=4, Lemon=2}

        System.out.println(StreamGroupingByExample.getNameGroupByPrice(fruitList));
        // {1=[Apple], 2=[Cherry], 3=[Grape], 4=[Lemon], 5=[Peach]}

    }
}
