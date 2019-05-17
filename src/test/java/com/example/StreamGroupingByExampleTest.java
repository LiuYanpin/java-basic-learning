package com.example;

import com.example.model.Fruit;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class StreamGroupingByExampleTest {

    private List<Fruit> fruits;

    @Before
    public void setUp() {
        fruits = Arrays.asList(
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
    }

    @Test
    public void should_return_count_given_different_fruits() {
        Map<String, Long> result = StreamGroupingByExample.getCount(fruits);
        assertEquals(3L, result.get("Apple").longValue());
        assertEquals(2L, result.get("Cherry").longValue());
        assertEquals(1L, result.get("Grape").longValue());
        assertEquals(1L, result.get("Lemon").longValue());
        assertEquals(1L, result.get("Peach").longValue());
        assertEquals(1L, result.get("Orange").longValue());
    }

    @Test
    public void should_return_quantity_given_different_fruits() {
        Map<String, Integer> result = StreamGroupingByExample.getSumOfQuantity(fruits);
        assertEquals(6, result.get("Apple").intValue());
        assertEquals(9, result.get("Cherry").intValue());
        assertEquals(1, result.get("Grape").intValue());
        assertEquals(2, result.get("Lemon").intValue());
        assertEquals(3, result.get("Peach").intValue());
        assertEquals(4, result.get("Orange").intValue());
    }

    @Test
    public void  should_return_name_set_given_different_fruits() {
        Map<Integer, Set<String>> result = StreamGroupingByExample.getNameGroupByPrice(fruits);
        assertEquals(new HashSet<String>(){{add("Apple");}}, result.get(1));
        assertEquals(new HashSet<String>(){{add("Cherry");}}, result.get(2));
        assertEquals(new HashSet<String>(){{add("Grape");}}, result.get(3));
        assertEquals(new HashSet<String>(){{add("Lemon");}}, result.get(4));
        assertEquals(new HashSet<String>(){{add("Peach");}}, result.get(5));
        assertEquals(new HashSet<String>(){{add("Orange");}}, result.get(6));
    }

    @Test
    public void should_print_all() {
        List<String> stringList = Arrays.asList("Apple", "Apple", "Apple", "Cherry", "Cherry", "Grape", "Lemon", "Peach", "Orange");

        System.out.println(StreamGroupingByExample.getCountOfString(stringList));
        // {Apple=3, Cherry=2, Grape=1, Peach=1, Orange=1, Lemon=1}

        System.out.println(StreamGroupingByExample.getCount(fruits));
        // {Apple=3, Cherry=2, Grape=1, Peach=1, Orange=1, Lemon=1}

        System.out.println(StreamGroupingByExample.getSumOfQuantity(fruits));
        // {Apple=6, Cherry=9, Grape=1, Peach=3, Orange=4, Lemon=2}

        System.out.println(StreamGroupingByExample.getNameGroupByPrice(fruits));
        // {1=[Apple], 2=[Cherry], 3=[Grape], 4=[Lemon], 5=[Peach], 6=[Orange]}
    }
}